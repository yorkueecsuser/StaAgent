class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case is unreachable
                System.out.println("This is an unreachable case");
                break;
        }
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case is unreachable
                System.out.println("This is an unreachable case");
                break;
        }
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that is not 1 to make the switch statement unreachable
    }
}