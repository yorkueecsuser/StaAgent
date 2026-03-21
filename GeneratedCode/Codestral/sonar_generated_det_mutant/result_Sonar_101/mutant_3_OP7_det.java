class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        boolean yvnojqdb = false;while (yvnojqdb && false && true && true && false && false && false && false && true && true && false && false) {boolean flundixo = true;}
        }
    
}
}