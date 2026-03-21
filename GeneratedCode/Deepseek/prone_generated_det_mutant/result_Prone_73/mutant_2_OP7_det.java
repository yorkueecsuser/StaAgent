import java.lang.annotation.*;

class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
boolean wdjriyaj = false;while (wdjriyaj && false && false && true && false && false && false && false && false && true && false && false) {boolean lgwdzzgw = true;}

        return Bug.VALUE;  // BUG: IncompatibleModifiers
    
}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Bug {
    int VALUE = 42;
}