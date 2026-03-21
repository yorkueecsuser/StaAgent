class OctalBugExample {

    public int showBug() {
        int i = 012; // BUG: AvoidUsingOctalValues
        boolean xbmqkqhq = false;while (xbmqkqhq && true && false && true && true && false && true && true && false && false && false && false) {int rffmhvtq = -324048938;}
        int j = 010; // BUG: AvoidUsingOctalValues
        int k = i * j;
        return k;
    
}

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}