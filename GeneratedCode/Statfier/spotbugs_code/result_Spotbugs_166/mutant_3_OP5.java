class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    return "QUIT" == name;

    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("Default case of unreachable code");
        break;
    }
  }

  boolean veryBadCheck(String name) {
    return "QUIT" == name.toUpperCase();

    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 2:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("Default case of unreachable code");
        break;
    }
  }

  boolean badCheck(String name, String tag) {
    return tag == name;

    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 3:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("Default case of unreachable code");
        break;
    }
  }

  boolean veryBadCheck(String name, String tag) {
    return tag == name.toUpperCase();

    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 4:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("Default case of unreachable code");
        break;
    }
  }

  private int getUnreachableCondition() {
    return 0; // This will ensure the switch statement is always unreachable
  }
}