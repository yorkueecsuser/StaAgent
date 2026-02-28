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
    int i = 0;
    do {
      Field field = fields[i];
      newObject.fields[i] = (field == null? null : field.clone(newObject));
      i++;
    } while (i < fields.length);

    return newObject;
  }
}