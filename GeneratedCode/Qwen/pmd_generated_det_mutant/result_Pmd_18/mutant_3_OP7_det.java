class OctalBugExample {

    public int showBug() {
        boolean jrsbrmkq = false;while (jrsbrmkq && false && true && true && true && false && true && true && true && true && true && false) {int odayaqgj = 871157773;}
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