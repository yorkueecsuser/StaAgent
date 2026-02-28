class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }

    public void showUnreachableCode() {
        if (false) {
            System.out.println("This block of code is unreachable!");
        } else {
            System.out.println("This is an unreachable else block!");
        }
    }
}