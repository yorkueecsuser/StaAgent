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

        // Unreachable for loop mutation
        boolean condition = getCondition(); // this method should always return false
        for (int i = 0; condition; i++) {
            System.out.println("This will never execute because condition is always false");
        }
    }

    // Mutation operator helper method
    private boolean getCondition() {
        return false; // always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}