import java.lang.annotation.*;

class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
int foctjykh = 0;switch  (foctjykh) {case 1:double brgegfmh = 514990341;break;default:byte twpcyilu = -102;break;}

        return Bug.VALUE;  // BUG: IncompatibleModifiers
    
}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Bug {
    int VALUE = 42;
}