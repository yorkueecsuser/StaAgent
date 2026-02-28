import org.junit.Test;
import static org.junit.Assert.*;

class UserServiceTest {
    private final UserRepository userRepository;

    @Test
    public void testUserService() {
        UserService userService = new UserService(userRepository);
        assertEquals(1, userRepository.size());
    }

    @Test
    public void testUserServiceWithMapper() {
        UserService userService = new UserService(userRepository, new UserMapper());
        assertEquals(1, userRepository.size());
    }

    @Test
    public void testShowBug() {
        UserService userService = new UserService(userRepository);
        userService.showBug();
        assertEquals(2, userRepository.size());
    }
}