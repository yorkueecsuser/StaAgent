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
        System.out.println(myAnnotation);

        // Mutant code being added
        boolean shouldRun = false;
        if (shouldRun) {
            // Dummy code to make the mutant non-trivial
            int a = 10;
            int b = 20;
            int sum = a + b;
            System.out.println("Sum: " + sum);
        } else {
            // Unreachable code
            int x = 5;
            System.out.println("Unreachable code: " + x);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}