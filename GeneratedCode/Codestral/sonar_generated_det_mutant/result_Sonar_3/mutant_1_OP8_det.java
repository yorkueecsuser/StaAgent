class StringIndexOutOfBoundsBug {
    public int showBug(String mainString, String subString, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return mainString.indexOf(subString, beginIndex, endIndex);
    }

    public static void main(String[] args) {
        StringIndexOutOfBoundsBug bug = new StringIndexOutOfBoundsBug();
        String llbzhkpt = "Hello, World!";
        String zpdphdfm = "World";
        int agjyxvcp = 12; // should be less than tzymtogb
        int tzymtogb = 5; // should be greater than agjyxvcp

        int pcshwagk = bug.showBug(llbzhkpt, zpdphdfm, agjyxvcp, tzymtogb);
        System.out.println("Result: " + pcshwagk);
    }
}