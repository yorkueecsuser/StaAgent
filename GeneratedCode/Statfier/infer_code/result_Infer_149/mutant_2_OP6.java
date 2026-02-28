import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  public void testSomething() {
    mField.toString();
    
    // Another unreachable for loop mutant
    boolean anotherConditionFor = getAnotherCondition();
    for (int j = 0; anotherConditionFor; j++) {
      // This loop is also unreachable because anotherConditionFor will be false
    }
  }

  private boolean getCondition() {
    return false;
  }

  private boolean getAnotherCondition() {
    return false;
  }
}