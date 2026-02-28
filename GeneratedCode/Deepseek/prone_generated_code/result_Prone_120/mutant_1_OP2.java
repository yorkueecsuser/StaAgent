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
        
        // Mutant code: Duplication
        // Duplicating the assignment statement and inserting immediately after its current location
        MyAnnotation duplicatedAnnotation = Main.class.getAnnotation(MyAnnotation.class);
        // Mutant code added: Printing the value of the duplicated annotation
        System.out.println(duplicatedAnnotation.value());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}