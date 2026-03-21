class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        if (true && false && false && true && false && false && true && false && false && true && false) {float otlystty = 802390599;}
        System.out.println(bar);
    
}
}