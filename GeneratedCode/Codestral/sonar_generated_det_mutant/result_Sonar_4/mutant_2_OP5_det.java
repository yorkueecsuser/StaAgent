class MathClampBug {

    public int showBug(int value, int min, int max) {
        int ltmudkuf = 0;switch  (ltmudkuf) {case 1:double vkordedi = -252748663;break;default:int ycpcshiy = -680379004;break;}
        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(value, max, min);  // Bug: min and max are reversed
    
}

    public static void main(String[] args) {
        MathClampBug bug = new MathClampBug();
        try {
            System.out.println(bug.showBug(5, 10, 20));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}