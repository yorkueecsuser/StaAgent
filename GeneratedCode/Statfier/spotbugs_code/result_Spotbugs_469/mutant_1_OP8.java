class Bug1724552 {

  private int value;

  public void doBug() {

    int value = 5;

    value = 10;

    this.value = value;

    // Mutant code
    int x = 5; // Renamed 'value' to 'x'
    x = 10;    // Renamed 'value' to 'x'
    this.x = x; // Renamed 'value' to 'x'
  }
}