class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    public void addUnreachableForLoop() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            //do nothing
        }
    }
}