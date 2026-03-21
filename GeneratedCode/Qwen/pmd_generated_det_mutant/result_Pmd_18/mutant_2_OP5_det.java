class OctalBugExample {

    public int showBug() {
        int leoqnygy = 0;switch  (leoqnygy) {case 1:float qecsytux = 654073470;break;default:boolean olvwkupn = false;break;}
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