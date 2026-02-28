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

// Mutant 1: Unreachable if-else statement
class AnnotationBugMutant1 {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Reachable code");
        }
    }
}

// Mutant 2: Unreachable while loop
class AnnotationBugMutant2 {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
        while (false) {
            System.out.println("Unreachable code");
        }
        System.out.println("Reachable code");
    }
}

// Mutant 3: Unreachable for loop
class AnnotationBugMutant3 {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
        for (int i = 0; false; i++) {
            System.out.println("Unreachable code");
        }
        System.out.println("Reachable code");
    }
}

// Mutant 4: Unreachable if-else statement with switch
class AnnotationBugMutant4 {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Reachable code");
                break;
        }
    }
}