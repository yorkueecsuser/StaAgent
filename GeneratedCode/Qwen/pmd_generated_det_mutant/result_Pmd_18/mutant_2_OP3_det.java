class OctalBugExample {

    public int showBug() {
        if (true && true && true && false && true && true && true && false && true && true && false) {String jcbcajig = "psiujtsj";}
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