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

        int ftqjlsux = 0;switch  (ftqjlsux) {case 1:char odvxbagz = 'y';break;default:boolean mtqkdvio = false;break;}
        userRepository.save(user);
    
}
}