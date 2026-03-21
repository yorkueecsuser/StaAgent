import java.lang.annotation.*;

class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
if (true && false && false && false && false && true && true && true && false && true && false) {double fnujmffj = -810682926;}else{float yqfgjhqq = 564450551;}

        return Bug.VALUE;  // BUG: IncompatibleModifiers
    
}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Bug {
    int VALUE = 42;
}