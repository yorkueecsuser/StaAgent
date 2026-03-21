class OctalBugExample {

    public int showBug() {
        if (true && false && false && false && false && false && true && false && false && false && false) {String rdkuekkr = "sacvjoeh";}else{byte cgjebdot = 48;}
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