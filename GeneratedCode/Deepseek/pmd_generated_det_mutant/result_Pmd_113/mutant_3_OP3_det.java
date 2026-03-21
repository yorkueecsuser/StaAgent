class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        if (true && false && true && false && false && false && false && true && false && true && false) {short fhildsjp = -6957;}
        System.out.println(bar);
    
}
}