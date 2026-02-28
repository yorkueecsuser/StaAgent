import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class SwitchEnum {
  int[] a = new int[8];

  // Java generates a class for the switch, which contains an int array
  // This leads to races where there are int arrays, here a[]
  public String getName(EnumClass value) {
    synchronized (this) {
      a[0] = 0; // should not report here
    }
    switch (value) {
      case VALUE1:
        return "value 1";
      case VALUE3:
        return "value 3";
      default:
        return "other";
    }
  }

  // Mutated code
  int[] b = new int[8]; // Added a new variable for mutation

  public String getLabel(EnumClass x) { // Renamed parameter 'value' to 'x'
    synchronized (this) {
      b[0] = 0; // Renamed variable 'a' to 'b' in this context
    }
    switch (x) {
      case VALUE1:
        return "value 1";
      case VALUE3:
        return "value 3";
      default:
        return "other";
    }
  }
}

enum EnumClass {
  VALUE1,
  VALUE2,
  VALUE3
}