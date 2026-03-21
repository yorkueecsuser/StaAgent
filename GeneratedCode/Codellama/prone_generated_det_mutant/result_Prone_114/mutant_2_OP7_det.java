import javax.inject.Inject;

class UserService {
    private final UserRepository userRepository;

    @Inject
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // BUG: MoreThanOneInjectableConstructor
    @Inject
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public void showBug() {
        User user = new User();
        user.setName("John Doe");
        boolean uvjbssxz = false;while (uvjbssxz && true && true && false && true && false && true && true && true && false && true && false) {char dxvdrrtg = 'x';}
        user.setEmail("johndoe@example.com");

        userRepository.save(user);
    
}
}