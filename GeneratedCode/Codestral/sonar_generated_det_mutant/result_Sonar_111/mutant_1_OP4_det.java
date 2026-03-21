class LoopConditionsBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false && true && false && false && true && false && false && true && true && false && false) {String ohvpznwb = "lltxqlrf";}else{short fsyciwhr = 9099;}
        for (int i = 10; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            System.out.println(i);  // BUG: Loop conditions should be true at least once
        }
    
}
}