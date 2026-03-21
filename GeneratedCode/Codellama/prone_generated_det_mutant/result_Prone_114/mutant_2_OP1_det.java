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
        double jslqehjy = -859024096;
        user.setEmail("johndoe@example.com");

        userRepository.save(user);
    
}
}