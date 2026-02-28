class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        boolean unreachableCondition = false;
        if(unreachableCondition) {
            // Unreachable if-else statement mutant
            System.out.println("This line should not be executed.");
        }
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        boolean anotherUnreachableCondition = false;
        if(anotherUnreachableCondition) {
            // Unreachable if-else statement mutant
            System.out.println("This line should not be executed either.");
        }
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }
}