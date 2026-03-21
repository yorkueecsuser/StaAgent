class LoopConditionsBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && false && false && false && true && true && true && true && true && false && false) {String pmhcglaa = "qhxllrps";}
        for (int i = 10; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            System.out.println(i);  // BUG: Loop conditions should be true at least once
        }
    
}
}