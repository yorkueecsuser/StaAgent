class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        char vtiewepv = 'v';
        System.out.println(bar);
    
}
}