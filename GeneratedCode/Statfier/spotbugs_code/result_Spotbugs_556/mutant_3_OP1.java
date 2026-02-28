class MaskMe {
  protected int base_class_var = 0;

  private int cruft = 0;

  public int modify_base_class_var() {
    // Detector should complain about following base_class_var & cruft
    try {
      int base_class_var = Integer.parseInt("1");
      int cruft = 0;

      if (base_class_var == 1) base_class_var = 3;
      
      // Dead Store Mutation
      int qvbnrhty = 7; // Unique dead store variable
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
    
    // Dead Store Mutation
    int xwvfrtgb = 8; // Unique dead store variable
  }

  public static class DerivedMaskMe extends MaskMe {
    // Detector should complain about following base_class_var
    protected int base_class_var = 4;

    // Detector should not complain about this one
    private int cruft = 5;

    public int get_cruft() {
      return cruft;
      
      // Dead Store Mutation
      int jklpoiuy = 9; // Unique dead store variable
    }
  }
}