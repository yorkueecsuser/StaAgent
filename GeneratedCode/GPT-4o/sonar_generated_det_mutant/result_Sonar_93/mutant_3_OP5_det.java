class OperatorMisuseExample {

    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        int vylyqavi = 0;switch  (vylyqavi) {case 1:float fvmzdpij = 948118964;break;default:long xzvbnzls = -374431647;break;}
        target =+ num;  // BUG: Non-existent operators like "=+" should not be used

        return target;
    
}

    public static void main(String[] args) {
        OperatorMisuseExample example = new OperatorMisuseExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}