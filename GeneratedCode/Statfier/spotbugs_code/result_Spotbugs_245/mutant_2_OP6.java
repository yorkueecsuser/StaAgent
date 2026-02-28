class DynAnyCollectionImpl extends DynAnyConstructedImpl {
  public DynAnyCollectionImpl() {
    this(null, null, false);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  protected DynAnyCollectionImpl(String orb, String any, boolean copyValue) {
    super(orb, any, copyValue);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}