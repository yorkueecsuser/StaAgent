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
        boolean veilxxox = false;while (veilxxox && false && false && true && true && false && true && true && false && false && false && false) {String muxihgln = "hujsvcwe";}
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        userRepository.save(user);
    
}
}