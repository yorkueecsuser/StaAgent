class MyClass {
  private boolean mutantCondition = true; // Mutant code

  public void doSomethingSynchronized() {
    if (mutantCondition) { // Mutant code
      synchronized (this.getClass()) {  // Noncompliant
        //...
      }
    }
  }

  public void showBug() {
    if (mutantCondition) { // Mutant code
      synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
        //...
      }
    }
  }

  // Additional getter and setter for mutantCondition to avoid unreachable statement error
  public boolean isMutantCondition() {
    return mutantCondition;
  }

  public void setMutantCondition(boolean mutantCondition) {
    this.mutantCondition = mutantCondition;
  }
}