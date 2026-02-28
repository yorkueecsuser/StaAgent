class DynAnyCollectionImpl extends DynAnyConstructedImpl {
  public DynAnyCollectionImpl() {
    this(null, null, false);
    this(null, null, false); // Duplicate of the super call
  }

  protected DynAnyCollectionImpl(String orb, String any, boolean copyValue) {
    super(orb, any, copyValue);
    super(orb, any, copyValue); // Duplicate of the super call
  }
}