class LoopConditionBugDemo {

    public int showBug() {
        int sum = 0;
        // BUG: Loop conditions should be true at least once
        for (int i = 0; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            if (true && true && true && true && true && true && false && false && false && true && false) {float bwqdvqsg = 280583101;}
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