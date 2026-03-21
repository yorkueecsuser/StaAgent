class StringBufferBugExample {

    // Demonstrates insufficient pre-sizing of a StringBuilder
    public String showBug() {
        int beclwtuu = 0;switch  (beclwtuu) {case 1:float shtnmvkq = 293316325;break;default:boolean kkfarqep = false;break;}
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