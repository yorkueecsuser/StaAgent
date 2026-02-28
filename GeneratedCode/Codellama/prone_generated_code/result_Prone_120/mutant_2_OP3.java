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

// Mutant 1: Inserting unreachable if branch into a randomly selected basic block in the program.
// The condition of the inserted branch is always false to make it unreachable.

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

        // Unreachable if branch
        if (false) {
            System.out.println("This branch is unreachable.");
        }
    }
}

// Mutant 2: Inserting unreachable while loop into a randomly selected basic block in the program.
// The condition of the inserted loop is always false to make it unreachable.

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

        // Unreachable while loop
        while (false) {
            System.out.println("This loop is unreachable.");
        }
    }
}

// Mutant 3: Inserting unreachable for loop into a randomly selected basic block in the program.
// The condition of the inserted loop is always false to make it unreachable.

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

        // Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable.");
        }
    }
}

// Mutant 4: Inserting unreachable if-else statement into a randomly selected basic block in the program.
// The condition of the inserted if-else statement is always false to make it unreachable.

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

        // Unreachable if-else statement
        if (false) {
            System.out.println("This if branch is unreachable.");
        } else {
            System.out.println("This else branch is unreachable.");
        }
    }
}

// Mutant 5: Inserting unreachable switch statement into a randomly selected basic block in the program.
// The condition of the inserted switch statement is always false to make it unreachable.

class AnnotationBugMutant5 {
    @MyAnnotation("Hello, World!")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public static void main(String[] args) {
        AnnotationBug instance = new AnnotationBug();
        MyAnnotation annotation = instance.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());

        // Unreachable switch statement
        switch (0) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
        }
    }
}