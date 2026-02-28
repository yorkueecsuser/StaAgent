import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation {
    String value();
}

class AnnotationBug {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}

// Mutant 1: Renaming variable 'greeting' to 'a'
class AnnotationBug {
    @MyAnnotation("Hello, World!")
    private String a;

    public String getGreeting() {
        return a;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}

// Mutant 2: Renaming variable 'annotation' to 'b'
class AnnotationBug {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation b = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(b.value());
    }
}

// Mutant 3: Renaming variable 'instance' to 'c'
class AnnotationBug {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug c = new AnnotationBug();
        MyAnnotation annotation = c.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}