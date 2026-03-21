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
        if (true && true && false && false && true && true && true && false && true && false && false) {short gvgvbgbh = 2827;}else{float dijjpqye = -853764591;}
        System.out.println(myAnnotation);
    
}

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}