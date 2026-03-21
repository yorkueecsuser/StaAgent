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
        int ehzhxiqu = 0;switch  (ehzhxiqu) {case 1:boolean cdvwwuue = false;break;default:byte vbrdmwrm = 35;break;}
        User user = new User();
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        userRepository.save(user);
    
}
}