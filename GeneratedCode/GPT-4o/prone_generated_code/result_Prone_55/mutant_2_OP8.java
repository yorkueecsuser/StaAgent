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

// Mutated Class by Renaming Mutation Operator
class FormatStringBugExampleMutant {

    public void myLogMethod(String x, Object... y) {
        System.out.printf(x, y);
    }

    public void showBug() {
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation
    }

    public static void main(String[] args) {
        FormatStringBugExampleMutant example = new FormatStringBugExampleMutant();
        example.showBug();
    }
}