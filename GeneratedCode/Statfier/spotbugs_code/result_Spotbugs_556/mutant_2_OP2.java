class MaskMe {
  protected int base_class_var = 0;

  private int cruft = 0;

  public int modify_base_class_var() {
    // Detector should complain about following base_class_var & cruft
    try {
      int base_class_var = Integer.parseInt("1");
      int cruft = 0;

      if (base_class_var == 1) base_class_var = 3;
      if (base_class_var == 1) base_class_var = 3; // Mutant: duplicated assignment
    } catch (NumberFormatException nfe) {
      base_class_var = 2;
      cruft = 3;
      base_class_var = 2; // Mutant: duplicated assignment
    }
    return base_class_var;
  }

  public int get_base_class_var() {
    return base_class_var + cruft;
  }

  // Detector should let this go, as it is a often used paradigm
  public void copy_base_class_var(int base_class_var) {
    this.base_class_var = base_class_var;
    this.base_class_var = base_class_var; // Mutant: duplicated assignment
  }

  public static class DerivedMaskMe extends MaskMe {
    // Detector should complain about following base_class_var
    protected int base_class_var = 4;
    protected int base_class_var = 4; // Mutant: duplicated assignment

    // Detector should not complain about this one
    private int cruft = 5;

    public int get_cruft() {
      return cruft;
    }
  }
}