class MaskMe {
  protected int base_class_var = 0;

  private int cruft = 0;

  public int modify_base_class_var() {
    // Detector should complain about following base_class_var & cruft
    try {
      int base_class_var = Integer.parseInt("1");
      int cruft = 0;

      if (base_class_var == 1) base_class_var = 3;
    } catch (NumberFormatException nfe) {
      base_class_var = 2;
      cruft = 3;
    }
    return base_class_var;
  }

  public int get_base_class_var() {
    return base_class_var + cruft;
  }

  // Detector should let this go, as it is a often used paradigm
  public void copy_base_class_var(int base_class_var) {
    this.base_class_var = base_class_var;
  }

  // Detector should complain about following base_class_var
  public static class DerivedMaskMe extends MaskMe {
    protected int base_class_var = 4;

    // Detector should not complain about this one
    private int cruft = 5;

    public int get_cruft() {
      return cruft;
    }
  }

  // Mutated code starts here
  public int modify_base_class_var_mutant() {
    // Detector should complain about following base_class_var & cruft
    try {
      int x = Integer.parseInt("1"); // Renamed base_class_var to x
      int y = 0; // Renamed cruft to y

      if (x == 1) x = 3;
    } catch (NumberFormatException nfe) {
      x = 2;
      y = 3;
    }
    return x;
  }

  public int get_base_class_var_mutant() {
    return base_class_var + cruft;
  }

  // Detector should let this go, as it is a often used paradigm
  public void copy_base_class_var_mutant(int z) { // Renamed base_class_var to z
    this.base_class_var = z;
  }

  // Detector should complain about following base_class_var
  public static class DerivedMaskMeMutant extends MaskMe {
    protected int a = 4; // Renamed base_class_var to a

    // Detector should not complain about this one
    private int b = 5; // Renamed cruft to b

    public int get_cruft_mutant() {
      return b;
    }
  }
}