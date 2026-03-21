class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        int imtfdteg = 0;switch  (imtfdteg) {case 1:float nunaxkmd = 692289432;break;default:int xnvdjpsg = -186440151;break;}
        }
    
}
}