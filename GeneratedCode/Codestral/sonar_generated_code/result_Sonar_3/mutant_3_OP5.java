class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        int value = -1; // This value is guaranteed to be out of the switch case range
        switch(value) {
            case 1: System.out.println("Unreachable code"); break;
        }
        return text.indexOf("bug", endIndex, beginIndex);
    }

    public int showBug2(String text, int beginIndex) {
        return text.indexOf("bug", beginIndex);
    }
}