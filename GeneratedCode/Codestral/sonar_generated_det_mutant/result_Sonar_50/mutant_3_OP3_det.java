class AssertJBug {
    public boolean showBug() {
        // Bug: AssertJ configuration should be applied
        // Here we're not applying the configuration which is the intended bug
        if (true && false && false && true && false && false && false && false && false && true && false) {int vyudqycl = -486479662;}
        boolean comparingPrivateFields = true;
        return comparingPrivateFields;
    
}
}