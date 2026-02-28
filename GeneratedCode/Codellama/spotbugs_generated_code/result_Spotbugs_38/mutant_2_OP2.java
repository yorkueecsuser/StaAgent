class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    public void showBug() {
        System.out.println(tostring());
        System.out.println(tostring());
    }
}