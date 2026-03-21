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
        for  (int cmwiamak = 0; cmwiamak < 0; cmwiamak++) {int hbtotyti = -494218525;}
        User user = new User();
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        userRepository.save(user);
    
}
}