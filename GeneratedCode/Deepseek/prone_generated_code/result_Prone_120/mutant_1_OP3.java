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
        // Mutated code: Unreachable if statement
        if (getCondition()) {
            // This code will never be executed
            System.out.println(myAnnotation);
        } else {
            // This code will always be executed
            System.out.println("This is an unreachable statement mutation");
        }
    }

    // A method to get the condition
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}