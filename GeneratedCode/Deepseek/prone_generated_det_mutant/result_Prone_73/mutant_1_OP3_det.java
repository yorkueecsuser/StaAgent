import java.lang.annotation.*;

class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
if (true && true && true && false && true && true && false && false && false && true && false) {short weboniov = -8871;}

        return Bug.VALUE;  // BUG: IncompatibleModifiers
    
}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Bug {
    int VALUE = 42;
}