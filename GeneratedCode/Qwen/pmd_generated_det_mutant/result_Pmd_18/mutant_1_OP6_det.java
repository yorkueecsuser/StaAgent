class OctalBugExample {

    public int showBug() {
        for  (int ztrcaagj = 0; ztrcaagj < 0; ztrcaagj++) {double zfchwkte = 4772940;}
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