// _SHOULD_BE_SKIPPED_

class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }
  
  // Mutation: Duplicating the assignment statement for 'f'
  public void setF(Object value) {
    this.f = value;  // Original assignment
    this.f = value;  // Duplicated assignment
  }
}