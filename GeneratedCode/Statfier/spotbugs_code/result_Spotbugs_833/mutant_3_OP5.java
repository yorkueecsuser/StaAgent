class CompareToFailure {

  public static void main(String[] args) {}

  public int compareTo(CompareToFailure ctf) {
    return 0;
  }

  // public int compareTo(Object o) {
  // return 0;
  // }

  public int recurso() {
    recurso();
    return 1;
  }

  // Inserting an unreachable switch statement
  public boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
      default:
        // Default case will always execute
        System.out.println("Default case executed");
        break;
    }
  }
}