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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is the original code
        newObject.fields[i] = (field == null? null : field.clone(newObject));
      } else {
        // This is the unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
    }

    return newObject;
  }

  private boolean getCondition() {
    // This method always returns false, making the else branch unreachable at runtime
    return false;
  }
}