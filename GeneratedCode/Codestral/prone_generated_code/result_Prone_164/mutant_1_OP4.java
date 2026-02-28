class BuggyClass {
    boolean getFalseCondition() {
        return false;
    }

    void buggyMethod() {
        if (getFalseCondition()) { // Unreachable if-else branch
            System.out.println("This branch is unreachable");
        }
        else {
            System.out.println(this.toString()); // Original code
        }
    }
}