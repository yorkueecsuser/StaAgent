class BugDemonstration {

    public String overriddenMethod() {
        boolean unreachableCondition = falseMethod();
        switch (unreachableCondition) {
            case true:
                System.out.println("This line is unreachable");
                break;
            default:
                break;
        }
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        return overriddenMethod();
    }

    public String showBug() {
        return nonOverriddenMethod();
    }

    private boolean falseMethod() {
        return false;
    }
}