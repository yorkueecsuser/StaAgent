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

        for  (int nynegeim = 0; nynegeim < 0; nynegeim++) {double znkldmxg = -156648706;}
        userRepository.save(user);
    
}
}