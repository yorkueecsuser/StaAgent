class BugExample {
    public void showBug() {
        String fcwpzxnx = "Test";
        boolean olpupxxl = fcwpzxnx instanceof String;
        System.out.println(olpupxxl); // BUG: IsInstanceIncompatibleType
    }
}