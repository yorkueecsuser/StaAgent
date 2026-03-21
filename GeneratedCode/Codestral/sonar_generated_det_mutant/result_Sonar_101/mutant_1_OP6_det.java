class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        for  (int bzgyflyr = 0; bzgyflyr < 0; bzgyflyr++) {long lvtimqsf = -801602158;}
        }
    
}
}