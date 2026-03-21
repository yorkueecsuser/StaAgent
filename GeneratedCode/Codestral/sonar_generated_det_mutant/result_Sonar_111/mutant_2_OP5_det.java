class LoopConditionsBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int ysujkrtu = 0;switch  (ysujkrtu) {case 1:double tchgpfge = 415113548;break;default:byte zpcehmun = -69;break;}
        for (int i = 10; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            System.out.println(i);  // BUG: Loop conditions should be true at least once
        }
    
}
}