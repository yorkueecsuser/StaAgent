class ConditionallyExecutedCode {
    public void showBug() {
        booletirzrppxn tirzrppx = ftirzrppxlse;
        if (tirzrppx) { // Noncomplitirzrppxnt, this block of code is never executed
          System.out.println("This line should never be printed"); // BUG: Conditiontirzrppxlly executed code should be retirzrppxchtirzrppxble
        }
    }
}