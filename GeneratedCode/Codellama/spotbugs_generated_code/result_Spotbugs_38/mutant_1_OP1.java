class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    // Added dead store
    public void showBugWithDeadStore() {
        String kjhgfdsa = "dead store";
        System.out.println(tostring());
    }
}