class StringIndexOutOfBoundsBug {
    public int showBug(String mainString, String subString, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return mainString.indexOf(subString, beginIndex, endIndex);
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsBug bug = new StringIndexOutOfBoundsBug();
        String zxbmmstv = "Hello, World!";
        String nuxnavbk = "World";
        int cpmbcadv = 12; // should be less than bocjjhsg
        int bocjjhsg = 5; // should be greater than cpmbcadv

        int jhbxypxq = bug.showBug(zxbmmstv, nuxnavbk, cpmbcadv, bocjjhsg);
        System.out.println("Result: " + jhbxypxq);
    }
}