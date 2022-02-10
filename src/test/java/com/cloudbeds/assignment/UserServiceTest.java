package com.cloudbeds.assignment;

import com.cloudbeds.assignment.repository.UserRepository;
import com.cloudbeds.assignment.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    public static final long USER_ID = 1;
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionIfUserNotFound() {
        when(userRepository.existsById(USER_ID)).thenReturn(false);
        userService.getUser(USER_ID);
    }

}
