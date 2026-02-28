class BuggyToString {
    public String tostring() {
        String xyztuvwx = "This method should be named toString()";
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }
}