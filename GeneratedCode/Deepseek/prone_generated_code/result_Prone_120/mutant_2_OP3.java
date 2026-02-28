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
        boolean isMyAnnotationPresent = myAnnotation!= null;
        // Mutated code
        if (isMyAnnotationPresent) {
            System.out.println(myAnnotation);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}