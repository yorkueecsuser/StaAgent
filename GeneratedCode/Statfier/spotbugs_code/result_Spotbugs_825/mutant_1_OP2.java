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
    this.wildcardF = wildcardF; // Mutant
    this.dummyF = dummyF;
    this.dummyF = dummyF; // Mutant
    this.dummyEF = dummyEF;
    this.dummyEF = dummyEF; // Mutant
    this.dummySF = dummySF;
    this.dummySF = dummySF; // Mutant
    this.childF = childF;
    this.childF = childF; // Mutant
    this.childEF = childEF;
    this.childEF = childEF; // Mutant
    this.childSF = childSF;
    this.childSF = childSF; // Mutant
    this.genericF = genericF;
    this.genericF = genericF; // Mutant
    this.genericEF = genericEF;
    this.genericEF = genericEF; // Mutant
    this.genericSF = genericSF;
    this.genericSF = genericSF; // Mutant

    Dummy dummy = new Dummy();
    DummyChild dummyChild = new DummyChild();
    String s = "Mismatched Type";

    wildcardF.contains(dummy); // No warning
    wildcardF.contains(dummyChild); // No warning
    wildcardF.contains(s); // No warning

    dummyF.contains(dummy); // No warning
    dummyF.contains(dummyChild); // No warning
    dummyF.contains(s); // HIGH

    dummyEF.contains(dummy); // No warning
    dummyEF.contains(dummyChild); // No warning
    dummyEF.contains(s); // HIGH

    dummySF.contains(dummy); // No warning
    dummySF.contains(dummyChild); // No warning
    dummySF.contains(s); // HIGH

    childF.contains(dummy); // No warning
    childF.contains(dummyChild); // No warning
    childF.contains(s); // HIGH

    childEF.contains(dummy); // No warning
    childEF.contains(dummyChild); // No warning
    childEF.contains(s); // HIGH

    childSF.contains(dummy); // No warning
    childSF.contains(dummyChild); // No warning
    childSF.contains(s); // HIGH

    genericF.contains(dummy); // No warning
    genericF.contains(dummyChild); // No warning
    genericF.contains(s); // No warning

    genericEF.contains(dummy); // No warning
    genericEF.contains(dummyChild); // No warning
    genericEF.contains(s); // No warning

    genericSF.contains(dummy); // No warning
    genericSF.contains(dummyChild); // No warning
    genericSF.contains(s); // No warning
  }

  @ExpectWarning("GC")
  public void testFields() {
    Dummy dummy = new Dummy();
    DummyChild dummyChild = new DummyChild();
    String s = "Mismatched Type";

    wildcardF.contains(dummy); // No warning
    wildcardF.contains(dummyChild); // No warning
    wildcardF.contains(s); // No warning

    dummyF.contains(dummy); // No warning
    dummyF.contains(dummyChild); // No warning
    dummyF.contains(s); // HIGH

    dummyEF.contains(dummy); // No warning
    dummyEF.contains(dummyChild); // No warning
    dummyEF.contains(s); // HIGH

    dummySF.contains(dummy); // No warning
    dummySF.contains(dummyChild); // No warning
    dummySF.contains(s); // HIGH

    childF.contains(dummy); // No warning
    childF.contains(dummyChild); // No warning
    childF.contains(s); // HIGH

    childEF.contains(dummy); // No warning
    childEF.contains(dummyChild); // No warning
    childEF.contains(s); // HIGH

    childSF.contains(dummy); // No warning
    childSF.contains(dummyChild); // No warning
    childSF.contains(s); // HIGH

    genericF.contains(dummy); // No warning
    genericF.contains(dummyChild); // No warning
    genericF.contains(s); // No warning

    genericEF.contains(dummy); // No warning
    genericEF.contains(dummyChild); // No warning
    genericEF.contains(s); // No warning

    genericSF.contains(dummy); // No warning
    genericSF.contains(dummyChild); // No warning
    genericSF.contains(s); // No warning

    // what if <T extends Dummy> in class definition?
    // Requires more analysis -- a future enhancement
    // Can we be sure that the T is the same as the one in the class/method
    // definition

  }
}