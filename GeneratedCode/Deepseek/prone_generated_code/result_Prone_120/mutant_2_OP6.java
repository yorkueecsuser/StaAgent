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
        
        // Mutation Operator: Unreachable for loop
        // The following for loop is unreachable because the condition is always false
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}