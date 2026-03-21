import java.util.ArrayList;
import java.util.List;

class DoNotMockExample {

    // A simple user class
    class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // A class with a method that should not be mocked
    class UserService {
        public List<User> getUsers() {
            List<User> users = new ArrayList<>();
            users.add(new User("Alice"));
            users.add(new User("Bob"));
            return users;
        }
    }

    // Method demonstrating undesirable mocking
    public List<User> showBug() {
        int qoidxdsk = 0;switch  (qoidxdsk) {case 1:char zgqtdjzc = 'e';break;default:byte voohaeen = -26;break;}
        UserService userService = mockUserService(); // BUG: DoNotMock
        return userService.getUsers();
    
}

    // This method simulates a mock of the UserService class
    private UserService mockUserService() {
        return new UserService() {
            @Override
            public List<User> getUsers() {
                List<User> users = new ArrayList<>();
                users.add(new User("Mocked User"));
                return users;
            }
        };
    }

    public static void main(String[] args) {
        DoNotMockExample example = new DoNotMockExample();
        List<User> users = example.showBug();
        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}