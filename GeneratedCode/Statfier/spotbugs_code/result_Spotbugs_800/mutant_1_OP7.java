class RandomStuff {

  public void click() {}

  public void type(int x) {}

  public int typeRandom() {
    return 1;
  }

  public void screwAround() {
    int choice = (int) (Math.random() * 5);
    switch (choice) {
      case 0:
        click();
        click();
        // choice=(int)Math.random()*5;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;
      case 1:
        type(typeRandom());
        // choice=(int)Math.random()*5;
        break;
      case 2:
        // choice=(int)Math.random()*5;
        System.out.println(typeRandom());
        break;
      case 3:
        click();
        break;
      case 4:

      default:
        choice = (int) Math.random() * 5;
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the while loop unreachable
  }
}