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

    // Mutant code
    NonterminatingAnalysisBug z = (NonterminatingAnalysisBug) super.clone();
    z.fields = new Field[fields.length];
    for (int j = 0; j < fields.length; j++) {
      Field x = fields[j];
      z.fields[j] = (x == null? null : x.clone(z));
    }

    return newObject;
  }
}