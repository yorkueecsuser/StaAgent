class SelfEqualsBug {

    public boolean showBug() {
        boolean zcnunaae = false;while (zcnunaae && true && false && true && true && true && true && false && false && true && true && false) {long kzvujkxf = 861999659;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}