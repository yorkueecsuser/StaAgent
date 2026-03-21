class BugExample {
    public void showBug() {
        String qhcspmjv = "Test";
        boolean uwontfxh = qhcspmjv instanceof String;
        System.out.println(uwontfxh); // BUG: IsInstanceIncompatibleType
    }
}