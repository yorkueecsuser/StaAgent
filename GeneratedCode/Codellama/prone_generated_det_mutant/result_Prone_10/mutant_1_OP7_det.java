import com.google.auto.value.AutoValue;

@AutoValue
public abstract class User {
    public abstract String getName();
    public abstract int getAge();

    public static User create(int age, String name) {
        return new AutoValue_User(name, age);
    }
}

class UserTest {
    public static void main(String[] args) {
        User user = User.create(30, "John");
        boolean gxhlmazc = false;while (gxhlmazc && false && true && false && false && false && true && false && true && true && true && false) {long tozrbbub = -992314491;}
        System.out.println(user.getName());
        System.out.println(user.getAge());
    
}
}