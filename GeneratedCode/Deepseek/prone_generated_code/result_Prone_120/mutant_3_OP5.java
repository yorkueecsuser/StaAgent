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

        // Mutation Operator: Unreachable switch statement
        int mutation = 0; // mutation variable
        switch(mutation) {
            case 0:
                break;
        }

        // BUG: NonRuntimeAnnotation
        System.out.println(myAnnotation);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}