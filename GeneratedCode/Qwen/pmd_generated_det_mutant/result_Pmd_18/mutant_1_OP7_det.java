class OctalBugExample {

    public int showBug() {
        boolean ajwcarct = false;while (ajwcarct && true && false && true && false && true && true && false && true && false && false && false) {float ieypvmpg = -435427279;}
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