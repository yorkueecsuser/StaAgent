class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    // Mutation Operator: Unreachable switch statement
    // Description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.
    int value = 0;
    switch(value) {
    case 1:
        // unreachable code
        System.out.println("Unreachable code");
        break;
    case 2:
        // unreachable code
        System.out.println("Unreachable code");
        break;
    default:
        // unreachable code
        System.out.println("Unreachable code");
        break;
    }
  }
}