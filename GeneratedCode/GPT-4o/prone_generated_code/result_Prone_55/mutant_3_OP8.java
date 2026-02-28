class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}

// Mutant code following the Renaming mutation operator
class FormatStringBugExampleMutant {
    
    public void logMethod(String format, Object... arguments) {
        System.out.printf(format, arguments);
    }

    public void displayBug() {
        logMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    }

    public static void main(String[] args) {
        FormatStringBugExampleMutant exampleMutant = new FormatStringBugExampleMutant();
        exampleMutant.displayBug();
    }
}