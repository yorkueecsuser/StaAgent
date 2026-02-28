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

        // Mutation Operator: Unreachable while loop
        // In this mutation, we add an unreachable while loop with the condition always false.
        boolean condition = false;
        while (condition) {
            // do nothing
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}