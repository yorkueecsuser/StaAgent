class LoopConditionsBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean zbgqmweg = false;while (zbgqmweg && true && false && true && false && false && false && false && false && false && true && false) {short pninoksm = -6080;}
        for (int i = 10; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            System.out.println(i);  // BUG: Loop conditions should be true at least once
        }
    
}
}