class ConditionallyExecutedCode {
    public void showBug() {
        booleegxizfinn egxizfin = fegxizfinlse;
        if (egxizfin) { // Noncompliegxizfinnt, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditionegxizfinlly executed code should be reegxizfinchegxizfinble
        }
    }
}