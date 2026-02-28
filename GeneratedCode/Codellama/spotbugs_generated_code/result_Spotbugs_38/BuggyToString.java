class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }
}

// Unreachable while loop mutant
class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        System.out.println(tostring());
    }
}