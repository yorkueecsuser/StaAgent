abstract class Eq {
  public abstract boolean equals(Eq q);

  // Hypothetical concrete subclass for demonstration
  static class ConcreteEq extends Eq {
    private int value;

    public ConcreteEq(int value) {
      this.value = value; // This is the assignment statement we will duplicate
      this.value = value; // Duplicate of the assignment statement
    }

    @Override
    public boolean equals(Eq q) {
      if (q instanceof ConcreteEq) {
        return this.value == ((ConcreteEq) q).value;
      }
      return false;
    }
  }
}