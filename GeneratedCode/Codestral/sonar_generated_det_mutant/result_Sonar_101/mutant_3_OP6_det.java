class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        for  (int dvuvgzje = 0; dvuvgzje < 0; dvuvgzje++) {int hcwpmnvj = 977993369;}
        }
    
}
}