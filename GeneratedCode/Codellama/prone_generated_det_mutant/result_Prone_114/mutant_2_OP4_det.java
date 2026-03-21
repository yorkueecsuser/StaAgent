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
        user.setEmail("johndoe@example.com");

        if (false && false && false && true && true && false && false && true && true && false && false) {double zofdlavp = 613674051;}else{byte plcmcevi = 72;}
        userRepository.save(user);
    
}
}