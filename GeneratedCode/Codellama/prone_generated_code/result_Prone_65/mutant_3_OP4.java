class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
        if (getCondition()) {
            System.out.println("Unreachable code: " + name);
        } else {
            System.out.println("Reachable code: " + name);
        }
    }

    private boolean getCondition() {
        return false;
    }
}