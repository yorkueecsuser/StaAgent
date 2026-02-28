import java.lang.annotation.*;

class Main {

    // Annotation declaration
    @Retention(RetentionPolicy.CLASS)
    @interface MyAnnotation {
        String value() default "default";
    }

    // Method with mutation
    public void showBug() {
        MyAnnotation myAnnotation = Main.class.getAnnotation(MyAnnotation.class);
        if (true) {
            System.out.println(myAnnotation);
        } else {
            // Mutation: Unreachable if-else statement
            System.out.println("This code will never be executed");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}