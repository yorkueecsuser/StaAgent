class NonterminatingAnalysisBug implements Cloneable {

  static class Field {
    Field clone(NonterminatingAnalysisBug bug) {
      return this;
    }
  }

  Field[] fields = new Field[5];

  @Override
  public NonterminatingAnalysisBug clone() throws CloneNotSupportedException {

    NonterminatingAnalysisBug newObject = (NonterminatingAnalysisBug) super.clone();

    newObject.fields = new Field[fields.length];
    for (int i = 0; i < fields.length; i++) {
      Field field = fields[i];
      newObject.fields[i] = (field == null? null : field.clone(newObject));

      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable block");
      } else {
        // This block will always execute
        System.out.println("This is the reachable block");
      }
    }

    return newObject;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}