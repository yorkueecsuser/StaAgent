class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        if (true && false && true && true && true && false && false && true && false && true && false) {boolean fgruwrol = false;}else{short wchuzgyw = -6510;}
        }
    
}
}