class DynAnyCollectionImpl extends DynAnyConstructedImpl {
  public DynAnyCollectionImpl() {
    this(null, null, false);
    // Unreachable for loop mutation
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  protected DynAnyCollectionImpl(String orb, String any, boolean copyValue) {
    super(orb, any, copyValue);
    // Unreachable for loop mutation
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}