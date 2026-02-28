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
        
        // Duplicating a randomly selected assignment statement that meets the criteria.
        FormatStringBugExample duplicateExample = example;
        FormatStringBugExample duplicateExampleAgain = example; // Duplicate the assignment
    }
}