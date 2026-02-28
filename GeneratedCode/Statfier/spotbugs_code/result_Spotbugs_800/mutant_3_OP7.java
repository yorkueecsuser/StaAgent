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
        boolean conditionWhile0 = getCondition();
        while (conditionWhile0) {
          // Unreachable code
        }
        break;
      case 1:
        type(typeRandom());
        // choice=(int)Math.random()*5;
        boolean conditionWhile1 = getCondition();
        while (conditionWhile1) {
          // Unreachable code
        }
        break;
      case 2:
        // choice=(int)Math.random()*5;
        System.out.println(typeRandom());
        boolean conditionWhile2 = getCondition();
        while (conditionWhile2) {
          // Unreachable code
        }
        break;
      case 3:
        click();
        boolean conditionWhile3 = getCondition();
        while (conditionWhile3) {
          // Unreachable code
        }
        break;
      case 4:
        boolean conditionWhile4 = getCondition();
        while (conditionWhile4) {
          // Unreachable code
        }
        break;

      default:
        choice = (int) Math.random() * 5;
        boolean conditionWhileDefault = getCondition();
        while (conditionWhileDefault) {
          // Unreachable code
        }
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}