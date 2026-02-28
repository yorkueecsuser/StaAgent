class Bug1871051 {
  @Override
  public Object clone() {
    Bug1871051 newInstance = new Bug1871051();
    Bug1871051 newInstanceDuplicate = new Bug1871051(); // Duplicate instantiation
    return newInstance;
  }
}