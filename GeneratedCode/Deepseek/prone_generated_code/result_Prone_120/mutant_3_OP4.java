import java.lang.annotation.*;

class Main {

    // Annotation declaration
    @Retention(RetentionPolicy.CLASS)
    @interface MyAnnotation {
        String value() default "default";
    }

    // Method with the bug
    public void showBug() {
        MyAnnotation myAnnotation = Main.class.getAnnotation(MyAnnotation.class);
        // BUG: NonRuntimeAnnotation
        // Unreachable if-else statement
        if (false) {
            System.out.println(myAnnotation);
        } else {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}