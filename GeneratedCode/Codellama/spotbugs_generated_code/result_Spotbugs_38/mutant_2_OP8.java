class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    public void showMutant() {
        String mutant = "mutant";
        System.out.println(mutant);
    }
}