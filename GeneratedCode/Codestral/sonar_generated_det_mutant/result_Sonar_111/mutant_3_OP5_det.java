class LoopConditionsBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int ayjohlqg = 0;switch  (ayjohlqg) {case 1:float ayuvogxz = 205368405;break;default:String wnazofnk = "qndhhdub";break;}
        for (int i = 10; i < 0; i++) {  // Noncompliant: the condition is always false, and the loop will never execute
            System.out.println(i);  // BUG: Loop conditions should be true at least once
        }
    
}
}