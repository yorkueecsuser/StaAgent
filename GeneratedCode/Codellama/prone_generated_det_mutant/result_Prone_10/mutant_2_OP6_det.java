import com.google.auto.value.AutoValue;

@AutoValue
public abstract class User {
    public abstract String getName();
    public abstract int getAge();

    public static User create(int age, String name) {
for  (int xfalaskp = 0; xfalaskp < 0; xfalaskp++) {char viogdrge = 'h';}

        return new AutoValue_User(name, age);
    
}
}

class UserTest {
    public static void main(String[] args) {
        User user = User.create(30, "John");
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}