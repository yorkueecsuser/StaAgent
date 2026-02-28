class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation
    private boolean dummy = false; // Dummy variable

    public void showBug() {
        System.out.println(bar);
    }

    public void unreachableSwitch() {
        switch (bar) {
            case "bar":
                dummy = true;
            default:
                dummy = false;
        }
    }
}