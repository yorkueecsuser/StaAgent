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
        System.out.println(user.getName());
        if (true && false && true && true && false && true && false && false && true && false && false) {boolean tmwjiwgr = true;}else{String dxviiftq = "fratgmsj";}
        System.out.println(user.getAge());
    
}
}