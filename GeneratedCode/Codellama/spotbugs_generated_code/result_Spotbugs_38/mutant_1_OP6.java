class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }
}

// Added unreachable for loop
for (int i = 0; false; i++) {
    // do nothing
}