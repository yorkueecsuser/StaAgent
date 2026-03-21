class AssertJBug {
public boolean showBug() {
    boolean comparingPrivateFields = true;
    comparingPrivateFields = true;
    return comparingPrivateFields;
}
}