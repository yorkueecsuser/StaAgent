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
    }

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() will never return true
    }

    return newObject;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and always returns false
    return false;
  }
}