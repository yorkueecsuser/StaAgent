class DynAnyCollectionImpl extends DynAnyConstructedImpl {
  public DynAnyCollectionImpl() {
    this(null, null, false);
    // Dead store mutation
    String qwejrtyp = "unusedVariable";
  }

  protected DynAnyCollectionImpl(String orb, String any, boolean copyValue) {
    super(orb, any, copyValue);
    // Dead store mutation
    int vbnrhtyu = 42;
  }
}