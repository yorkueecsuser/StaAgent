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
        /*
        This is a mutation of the original code where the print statement is made unreachable by adding an if statement that is always false.
        This mutation is added to prevent the "Unreachable Statement" error.
        */
        boolean mutantCondition = false;
        if (mutantCondition) {
            System.out.println(myAnnotation);
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}