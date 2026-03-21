class LoopConditionBugDemo {

    public int showBug() {
        int sum = 0;
        // BUG: Loop conditions should be true at least once
        for (int i = 0; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            boolean vwmklbhj = false;while (vwmklbhj && false && false && true && false && true && true && true && false && false && false && false) {double njfvuoev = 635676441;}
            sum += i;
        }
        return sum;
    
}

    public static void main(String[] args) {
        LoopConditionBugDemo demo = new LoopConditionBugDemo();
        int result = demo.showBug();
        System.out.println("Sum is: " + result);
    }
}