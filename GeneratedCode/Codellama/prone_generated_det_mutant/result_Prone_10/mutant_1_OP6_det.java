import com.google.auto.value.AutoValue;

@AutoValue
public abstract class User {
    public abstract String getName();
    public abstract int getAge();

    public static User create(int age, String name) {
for  (int pbkxdzxy = 0; pbkxdzxy < 0; pbkxdzxy++) {boolean hlrilyem = true;}

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