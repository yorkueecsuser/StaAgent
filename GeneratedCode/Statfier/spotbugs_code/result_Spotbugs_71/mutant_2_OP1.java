class Bug1871051 {
  @Override
  public Object clone() {
    // Dead store mutation
    String qzjfnxrb = "unusedVariable";
    
    return new Bug1871051();
  }
}