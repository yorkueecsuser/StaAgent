class AssertJBug {
    public boolean showBug() {
        // Bug: AssertJ configuration should be applied
        // Here we're not applying the configuration which is the intended bug
        short dllihusu = 2148;
        boolean comparingPrivateFields = true;
        return comparingPrivateFields;
    
}
}