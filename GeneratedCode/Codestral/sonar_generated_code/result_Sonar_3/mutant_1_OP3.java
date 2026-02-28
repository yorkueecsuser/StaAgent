class StringIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(String text, int beginIndex, int endIndex) {
        if (getFalseCondition()) {
            // Unreachable if statement
            System.out.println("This line is unreachable");
        }
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        if (getFalseCondition()) {
            // Unreachable if statement
            System.out.println("This line is unreachable");
        }
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }
}