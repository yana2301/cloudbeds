package com.cloudbeds.assignment.repository;

import com.cloudbeds.assignment.repository.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT u, a FROM User u, Address a WHERE a.user.id = u.id AND a.country = :country")
    List<User> findUsersByCountry(@Param("country") String country);

}
