import java.lang.annotation.*;

class Main {

    // Annotation declaration
    @Retention(RetentionPolicy.CLASS)
    @interface MyAnnotation {
        String value() default "default";
    }

    // Method with the bug
    public void showBug() {
        MyAnnotation myAnnotationRenamed = Main.class.getAnnotation(MyAnnotation.class);
        // Mutation: Renaming
        if (myAnnotationRenamed!= null) {
            System.out.println(myAnnotationRenamed);
        } else {
            System.out.println("myAnnotationRenamed is null");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}