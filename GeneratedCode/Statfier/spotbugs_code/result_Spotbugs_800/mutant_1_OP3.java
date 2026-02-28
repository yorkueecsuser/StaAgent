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
          System.out.println("This is an unreachable if statement in case 0");
        }
        break;
      case 1:
        type(typeRandom());
        // choice=(int)Math.random()*5;
        boolean unreachableCondition1 = getUnreachableCondition();
        if (unreachableCondition1) {
          System.out.println("This is an unreachable if statement in case 1");
        }
        break;
      case 2:
        // choice=(int)Math.random()*5;
        System.out.println(typeRandom());
        boolean unreachableCondition2 = getUnreachableCondition();
        if (unreachableCondition2) {
          System.out.println("This is an unreachable if statement in case 2");
        }
        break;
      case 3:
        click();
        boolean unreachableCondition3 = getUnreachableCondition();
        if (unreachableCondition3) {
          System.out.println("This is an unreachable if statement in case 3");
        }
        break;
      case 4:
        boolean unreachableCondition4 = getUnreachableCondition();
        if (unreachableCondition4) {
          System.out.println("This is an unreachable if statement in case 4");
        }
        break;

      default:
        choice = (int) Math.random() * 5;
        boolean unreachableConditionDefault = getUnreachableCondition();
        if (unreachableConditionDefault) {
          System.out.println("This is an unreachable if statement in default case");
        }
        break;
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statements unreachable
  }
}