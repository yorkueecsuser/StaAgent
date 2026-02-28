import java.util.ArrayList;

class ArrayListContains0<T> {

  static class Dummy {}

  static class DummyChild extends Dummy {}

  private ArrayList<?> wildcardF;

  private ArrayList<Dummy> dummyF;

  private ArrayList<? extends Dummy> dummyEF;

  private ArrayList<? super Dummy> dummySF;

  private ArrayList<DummyChild> childF;

  private ArrayList<? extends DummyChild> childEF;

  private ArrayList<? super DummyChild> childSF;

  private ArrayList<T> genericF;

  private ArrayList<? extends T> genericEF;

  private ArrayList<? super T> genericSF;

  public ArrayListContains0(
      ArrayList<?> wildcardF,
      ArrayList<Dummy> dummyF,
      ArrayList<? extends Dummy> dummyEF,
      ArrayList<? super Dummy> dummySF,
      ArrayList<DummyChild> childF,
      ArrayList<? extends DummyChild> childEF,
      ArrayList<? super DummyChild> childSF,
      ArrayList<T> genericF,
      ArrayList<? extends T> genericEF,
      ArrayList<? super T> genericSF) {

    Dummy dummy = new Dummy();
    DummyChild dummyChild = new DummyChild();
    String s = "Mismatched Type";

    boolean condition = getCondition();

    wildcardF.contains(s); // No warning

    if (condition) {
        // Unreachable if statement
        if (isUnreachable()) {
            System.out.println("This is an unreachable statement.");
        }
    }

    dummyF.contains(s); // HIGH

    dummyEF.contains(s); // HIGH

    dummySF.contains(s); // HIGH

    childF.contains(s); // HIGH

    childEF.contains(s); // HIGH

    childSF.contains(s); // HIGH
  }

  private boolean getCondition() {
    return false;
  }

  private boolean isUnreachable() {
    return false;
  }
}