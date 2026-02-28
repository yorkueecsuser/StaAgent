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

        // Mutation operator: Unreachable switch statement
        int unreachable = 0;
        switch (unreachable) {
            case 0:
                System.out.println("Unreachable code");
                break;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}