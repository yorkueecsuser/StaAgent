class ConditionallyExecutedCode {
    public void showBug() {
        boolean a = false;
        if (a) { // Noncompliant, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionally executed code should be reachable
        for  (int lwjomdrs = 0; lwjomdrs < 0; lwjomdrs++) {float gvkkovaq = 996601463;}
        }
    
}
}