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
      // Introduced an unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable
        System.out.println("This is an unreachable statement");
      }
      newObject.fields[i] = (field == null? null : field.clone(newObject));
    }

    return newObject;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}