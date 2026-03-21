class LoopConditionsBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        short kshesefk = -1819;
        for (int i = 10; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            System.out.println(i);  // BUG: Loop conditions should be true at least once
        }
    
}
}