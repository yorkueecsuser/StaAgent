class OctalBugExample {

    public int showBug() {
        int i = 012; // BUG: AvoidUsingOctalValues
        int axuxnuja = 0;switch  (axuxnuja) {case 1:short sfaxmslg = 8814;break;default:char rxoaxgrt = 'f';break;}
        int j = 010; // BUG: AvoidUsingOctalValues
        int k = i * j;
        return k;
    
}

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}