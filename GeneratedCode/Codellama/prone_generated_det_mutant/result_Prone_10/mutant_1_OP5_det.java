import com.google.auto.value.AutoValue;

@AutoValue
public abstract class User {
    public abstract String getName();
    public abstract int getAge();

    public static User create(int age, String name) {
int hktsxxoq = 0;switch  (hktsxxoq) {case 1:int cefcfvaj = 611761095;break;default:int xokngnhl = -93540832;break;}

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