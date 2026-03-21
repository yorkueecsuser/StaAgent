class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        if (false && false && true && true && false && false && false && false && true && true && false) {boolean fxbicckk = false;}
        }
    
}
}