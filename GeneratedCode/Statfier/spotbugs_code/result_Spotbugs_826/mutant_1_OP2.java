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
    Dummy dummyCopy = new Dummy(); // Added duplicate assignment
    DummyChild dummyChild = new DummyChild();
    DummyChild dummyChildCopy = new DummyChild(); // Added duplicate assignment
    String s = "Mismatched Type";
    String sCopy = "Mismatched Type"; // Added duplicate assignment

    wildcardF.contains(s); // No warning

    dummyF.contains(s); // HIGH
    dummyF.contains(sCopy); // Added duplicate call

    dummyEF.contains(s); // HIGH
    dummyEF.contains(sCopy); // Added duplicate call

    dummySF.contains(s); // HIGH
    dummySF.contains(sCopy); // Added duplicate call

    childF.contains(s); // HIGH
    childF.contains(sCopy); // Added duplicate call

    childEF.contains(s); // HIGH
    childEF.contains(sCopy); // Added duplicate call

    childSF.contains(s); // HIGH
    childSF.contains(sCopy); // Added duplicate call
  }
}