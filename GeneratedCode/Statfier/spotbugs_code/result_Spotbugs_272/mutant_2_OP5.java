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

      // Inserting unreachable switch statement
      boolean unreachableCondition = getUnreachableCondition();
      switch(unreachableCondition) {
        case true:
          System.out.println("This is an unreachable case.");
          break;
        default:
          System.out.println("This is also unreachable.");
          break;
      }
    }

    return newObject;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}