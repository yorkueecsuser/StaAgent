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

// Mutant 1: Renaming variable "greeting" to "message"
class AnnotationBug {
    @MyAnnotation("Hello, World!")
    private String message;

    public String getGreeting() {
        return message;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}

// Mutant 2: Renaming variable "annotation" to "myAnnotation"
class AnnotationBug {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation myAnnotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.value());
    }
}

// Mutant 3: Renaming variable "instance" to "annotationInstance"
class AnnotationBug {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug annotationInstance = new AnnotationBug();
        MyAnnotation annotation = annotationInstance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}