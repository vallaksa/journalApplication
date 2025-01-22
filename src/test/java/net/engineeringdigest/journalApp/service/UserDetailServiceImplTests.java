package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

public class UserDetailServiceImplTests {

    @InjectMocks
    private UserDetailServiceImpl userDetailService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void loadUserByUsernameTest() {
        // Arrange
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("Tej").password("something").roles(new ArrayList<>()).build());
        UserDetails user = userDetailService.loadUserByUsername("Tej");
        Assertions.assertNotNull(user);
    }
}