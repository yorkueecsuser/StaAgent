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

// Mutant 1: Insert an unreachable if branch
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

        // Inserted code
        if (false) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
    }
}

// Mutant 2: Insert an unreachable while loop
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

        // Inserted code
        while (false) {
            System.out.println("This loop is unreachable");
        }
    }
}

// Mutant 3: Insert an unreachable for loop
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

        // Inserted code
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }
    }
}

// Mutant 4: Insert an unreachable if-else statement
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

        // Inserted code
        if (false) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is reachable");
        }
    }
}

// Mutant 5: Insert an unreachable switch statement
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

        // Inserted code
        switch (0) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This branch is reachable");
                break;
        }
    }
}