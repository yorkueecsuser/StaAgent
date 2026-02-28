class Bug1726846 {

  private static final int[] INTS = {1, 2, 3};

  public static final int[] getInts() {
    return INTS;
  }

  private static int theStatic = 0;

  public void bug() {
    // Here is a write to a static field from an instance method
    theStatic = 17;
  }

  // Mutated code
  private static final int[] intsArray = {1, 2, 3}; // Renamed INTS to intsArray

  public static final int[] getArray() {
    return intsArray; // Renamed INTS to intsArray
  }

  private static int staticVar = 0; // Renamed theStatic to staticVar

  public void mutatedBug() {
    // Here is a write to a static field from an instance method
    staticVar = 17; // Renamed theStatic to staticVar
  }
}