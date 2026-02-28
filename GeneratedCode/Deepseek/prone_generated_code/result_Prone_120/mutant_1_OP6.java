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
        boolean unreachable = false; // Added Mutant
        if (unreachable) { // Mutation: Unreachable for loop
            for (int i = 0; i < 10; i++) {
                System.out.println("This is an unreachable loop.");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}