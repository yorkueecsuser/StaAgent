class BuggyClass {

  private String nonNullField;

  public BuggyClass(String color) {
    nonNullField = color;
  }

  public String buggyMethod() {
    String mix = null;

    // Added unreachable switch statement
    boolean shouldNotRun = getCondition();
    if (!shouldNotRun) {
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This line should never be reached");
                break;
        }
    }

    return mix;
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }

  public String showBug() {
    BuggyClass bc = new BuggyClass(null);
    return bc.buggyMethod();
  }
}