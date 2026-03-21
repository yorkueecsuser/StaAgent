class AssertJBug {
    public boolean showBug() {
        // Bug: AssertJ configuration should be applied
        // Here we're not applying the configuration which is the intended bug
        if (true && true && true && true && true && true && true && false && true && true && false) {boolean hgqzaret = true;}
        boolean comparingPrivateFields = true;
        return comparingPrivateFields;
    
}
}