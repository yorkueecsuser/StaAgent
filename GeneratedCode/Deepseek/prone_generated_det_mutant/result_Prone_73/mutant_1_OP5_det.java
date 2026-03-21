import java.lang.annotation.*;

class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
int zrzqpcol = 0;switch  (zrzqpcol) {case 1:short onckcsbn = 3042;break;default:short vtisirtg = 1401;break;}

        return Bug.VALUE;  // BUG: IncompatibleModifiers
    
}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Bug {
    int VALUE = 42;
}