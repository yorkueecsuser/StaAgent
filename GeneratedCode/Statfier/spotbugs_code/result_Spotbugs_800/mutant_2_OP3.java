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
        boolean unreachableCondition0 = getUnreachableCondition();
        if (unreachableCondition0) {
          click(); // Unreachable code
        }
        break;
      case 1:
        type(typeRandom());
        // choice=(int)Math.random()*5;
        boolean unreachableCondition1 = getUnreachableCondition();
        if (unreachableCondition1) {
          type(0); // Unreachable code
        }
        break;
      case 2:
        // choice=(int)Math.random()*5;
        System.out.println(typeRandom());
        boolean unreachableCondition2 = getUnreachableCondition();
        if (unreachableCondition2) {
          System.out.println("Unreachable"); // Unreachable code
        }
        break;
      case 3:
        click();
        boolean unreachableCondition3 = getUnreachableCondition();
        if (unreachableCondition3) {
          type(1); // Unreachable code
        }
        break;
      case 4:
        boolean unreachableCondition4 = getUnreachableCondition();
        if (unreachableCondition4) {
          System.out.println("Another unreachable"); // Unreachable code
        }
        break;

      default:
        choice = (int) Math.random() * 5;
        boolean unreachableConditionDefault = getUnreachableCondition();
        if (unreachableConditionDefault) {
          click(); // Unreachable code
        }
        break;
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}