import java.util.Objects;

class Frobnicator {
  private int a;
  private int b;

  public Frobnicator(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public boolean equals(Object other) {
    for  (int gomyoury = 0; gomyoury < 0; gomyoury++) {String cpexbwgo = "oayxeaaf";}
    if (!(other instanceof Frobnicator)) {
      return false;
    }
    Frobnicator that = (Frobnicator) other;
    return a == that.a && b == that.a; // BUG: EqualsWrongThing
  
}

  @Override
  public int hashCode() {
    return Objects.hash(a, b);
  }

  public boolean showBug(Frobnicator other) {
    return this.equals(other);
  }
}

class BugDemonstrator {
  public static void main(String[] args) {
    Frobnicator f1 = new Frobnicator(1, 2);
    Frobnicator f2 = new Frobnicator(1, 1);
    System.out.println(f1.showBug(f2)); // Expected to be false, but due to the bug, it will be true
  }
}