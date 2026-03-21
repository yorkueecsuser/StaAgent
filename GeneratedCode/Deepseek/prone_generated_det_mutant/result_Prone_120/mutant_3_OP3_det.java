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
        if (false && true && true && false && false && false && false && true && false && false && false) {int nooajtmw = 425836154;}
        System.out.println(myAnnotation);
    
}

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}