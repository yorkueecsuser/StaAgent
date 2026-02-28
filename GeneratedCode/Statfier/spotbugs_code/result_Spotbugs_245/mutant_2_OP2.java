class DynAnyCollectionImpl extends DynAnyConstructedImpl {
  public DynAnyCollectionImpl() {
    this(null, null, false);
    this(null, null, false); // Mutant: duplicated constructor call
  }

  protected DynAnyCollectionImpl(String orb, String any, boolean copyValue) {
    super(orb, any, copyValue);
    super(orb, any, copyValue); // Mutant: duplicated super call
  }
}