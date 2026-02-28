class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;
    value = 10; // Mutant: duplicated assignment

    this.value = value;
  }
}