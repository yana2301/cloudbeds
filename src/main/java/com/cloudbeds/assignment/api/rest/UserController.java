package com.cloudbeds.assignment.api.rest;

import com.cloudbeds.assignment.model.UserDto;
import com.cloudbeds.assignment.service.UserService;
import liquibase.pro.packaged.V;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Creates new user
     *
     * @param userDto new user data
     * @return id of the created user
     */
    @PostMapping
    public Long createUser(@Valid @RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    /**
     * Updates the existing user
     *
     * @param id      id of the user
     * @param userDto fields for update
     */
    @PutMapping(value = "/{id}")
    public void updateUser(@PathVariable Long id, @Valid @RequestBody UserDto userDto) {
        userService.updateUser(id, userDto);
    }

    /**
     * Returns user by id
     *
     * @param id id of the user
     * @return user data
     * @throws Not Found exeption if id does not exist
     */
    @GetMapping(value = "/{id}", produces = "application/json")
    public UserDto getUserById(@PathVariable Long id) {
        return userService.getUser(id);
    }

    /**
     * Queries users by their properties
     *
     * @param country user's country
     * @return list of users that match the query
     */
    @GetMapping(value = "/query", produces = "application/json")
    public List<UserDto> findUsers(@RequestParam("country") String country) {
        return userService.findUsersByCountry(country);
    }

    /**
     * Deletes user by id
     *
     * @param id id of the user
     * @throws Not Found exeption if id does not exist
     */
    @DeleteMapping(value = "/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @ExceptionHandler(value = {IllegalArgumentException.class, IllegalStateException.class, ConstraintViolationException.class})
    protected ResponseEntity<Object> handleBadRequest(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = ex.getMessage();
        return new ResponseEntity<>(bodyOfResponse, HttpStatus.BAD_REQUEST);
    }

}
