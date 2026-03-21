class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        if (false && false && false && true && false && true && true && true && true && true && false) {double tdtvnxdf = 359950127;}
        System.out.println(bar);
    
}
}