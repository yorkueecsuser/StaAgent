import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.ArrayList;

class ArrayListContains<T> {

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

  @ExpectWarning("GC")
  public ArrayListContains(
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
    this.wildcardF = wildcardF;
    this.dummyF = dummyF;
    this.dummyEF = dummyEF;
    this.dummySF = dummySF;
    this.childF = childF;
    this.childEF = childEF;
    this.childSF = childSF;
    this.genericF = genericF;
    this.genericEF = genericEF;
    this.genericSF = genericSF;

    Dummy x = new Dummy();
    DummyChild y = new DummyChild();
    String z = "Mismatched Type";

    wildcardF.contains(x); // No warning
    wildcardF.contains(y); // No warning
    wildcardF.contains(z); // No warning

    dummyF.contains(x); // No warning
    dummyF.contains(y); // No warning
    dummyF.contains(z); // HIGH

    dummyEF.contains(x); // No warning
    dummyEF.contains(y); // No warning
    dummyEF.contains(z); // HIGH

    dummySF.contains(x); // No warning
    dummySF.contains(y); // No warning
    dummySF.contains(z); // HIGH

    childF.contains(x); // No warning
    childF.contains(y); // No warning
    childF.contains(z); // HIGH

    childEF.contains(x); // No warning
    childEF.contains(y); // No warning
    childEF.contains(z); // HIGH

    childSF.contains(x); // No warning
    childSF.contains(y); // No warning
    childSF.contains(z); // HIGH

    genericF.contains(x); // No warning
    genericF.contains(y); // No warning
    genericF.contains(z); // No warning

    genericEF.contains(x); // No warning
    genericEF.contains(y); // No warning
    genericEF.contains(z); // No warning

    genericSF.contains(x); // No warning
    genericSF.contains(y); // No warning
    genericSF.contains(z); // No warning
  }

  @ExpectWarning("GC")
  public void testFields() {
    Dummy a = new Dummy();
    DummyChild b = new DummyChild();
    String c = "Mismatched Type";

    wildcardF.contains(a); // No warning
    wildcardF.contains(b); // No warning
    wildcardF.contains(c); // No warning

    dummyF.contains(a); // No warning
    dummyF.contains(b); // No warning
    dummyF.contains(c); // HIGH

    dummyEF.contains(a); // No warning
    dummyEF.contains(b); // No warning
    dummyEF.contains(c); // HIGH

    dummySF.contains(a); // No warning
    dummySF.contains(b); // No warning
    dummySF.contains(c); // HIGH

    childF.contains(a); // No warning
    childF.contains(b); // No warning
    childF.contains(c); // HIGH

    childEF.contains(a); // No warning
    childEF.contains(b); // No warning
    childEF.contains(c); // HIGH

    childSF.contains(a); // No warning
    childSF.contains(b); // No warning
    childSF.contains(c); // HIGH

    genericF.contains(a); // No warning
    genericF.contains(b); // No warning
    genericF.contains(c); // No warning

    genericEF.contains(a); // No warning
    genericEF.contains(b); // No warning
    genericEF.contains(c); // No warning

    genericSF.contains(a); // No warning
    genericSF.contains(b); // No warning
    genericSF.contains(c); // No warning

    // what if <T extends Dummy> in class definition?
    // Requires more analysis -- a future enhancement
    // Can we be sure that the T is the same as the one in the class/method
    // definition

  }
}