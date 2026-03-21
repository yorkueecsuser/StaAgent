class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        boolean peyjavcp = false;while (peyjavcp && true && false && true && true && true && false && false && true && true && true && false) {float kpwjkbgk = -117426631;}
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    
}

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);
    }
}