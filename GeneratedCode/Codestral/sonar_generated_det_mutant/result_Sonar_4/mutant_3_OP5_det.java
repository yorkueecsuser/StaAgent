class MathClampBug {

    public int showBug(int value, int min, int max) {
        int epqtfepj = 0;switch  (epqtfepj) {case 1:double sgalkuwv = 150211782;break;default:char wblgheps = 'f';break;}
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