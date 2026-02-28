class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
    }

    public void showMutant(String input) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("Unreachable code: " + name);
        }
    }
}