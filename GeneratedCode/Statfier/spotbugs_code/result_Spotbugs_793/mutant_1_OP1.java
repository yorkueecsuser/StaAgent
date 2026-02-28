class Issue758 {

  public void method() {
    Object[] array = new String[3];
    Object[] objects = (Object[]) array;
    // Added dead store as per mutation operator
    String abcdefgh = "unusedVariable";
  }
}