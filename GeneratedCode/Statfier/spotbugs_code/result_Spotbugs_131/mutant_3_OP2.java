abstract class Eq {
  public abstract boolean equals(Eq q);
}

class ConcreteEq extends Eq {
  private int value;

  public ConcreteEq(int value) {
    this.value = value; // Original assignment statement
    this.value = value; // Duplicated assignment statement
  }

  @Override
  public boolean equals(Eq q) {
    if (q instanceof ConcreteEq) {
      return this.value == ((ConcreteEq) q).value;
    }
    return false;
  }
}