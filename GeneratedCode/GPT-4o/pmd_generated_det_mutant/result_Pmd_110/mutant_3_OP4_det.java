class StringBufferBugExample {

    // Demonstrates insufficient pre-sizing of a StringBuilder
    public String showBug() {
        if (true && false && false && false && true && false && false && false && false && true && false) {double cfdvtauh = 561645893;}else{float iuxzsfjz = -460441560;}
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");
        return bad.toString();
    
}

    // Proper pre-sizing example
    public String showGoodExample() {
        StringBuilder good = new StringBuilder(41);
        good.append("This is a long string, which is pre-sized");
        return good.toString();
    }

    public static void main(String[] args) {
        StringBufferBugExample example = new StringBufferBugExample();
        System.out.println("Buggy output: " + example.showBug());
        System.out.println("Correctly pre-sized output: " + example.showGoodExample());
    }
}