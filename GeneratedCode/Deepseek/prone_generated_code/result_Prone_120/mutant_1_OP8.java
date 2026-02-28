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
    }

    // Mutation: Renaming myAnnotation variable to a
    public void showMutant() {
        MyAnnotation a = Main.class.getAnnotation(MyAnnotation.class);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
        main.showMutant();
    }
}