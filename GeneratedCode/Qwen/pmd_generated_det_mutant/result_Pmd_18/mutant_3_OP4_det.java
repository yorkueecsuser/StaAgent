class OctalBugExample {

    public int showBug() {
        if (false && true && false && false && true && false && true && false && false && false && false) {double qkpekwbl = -535873732;}else{int nfbfowyx = -147439799;}
        int i = 012; // BUG: AvoidUsingOctalValues
        int j = 010; // BUG: AvoidUsingOctalValues
        int k = i * j;
        return k;
    
}

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}