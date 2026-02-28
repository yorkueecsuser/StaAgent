class StringIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(String text, int beginIndex, int endIndex) {
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This line will never be executed.");
        }
        return text.indexOf("bug", endIndex, beginIndex);
    }

    public int showBug2(String text, int beginIndex) {
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This line will never be executed.");
        }
        return text.indexOf("bug", beginIndex);
    }
}