class BugDemonstration {

    public String overriddenMethod() {
        int value = getValue();
        switch (value) {
            case 1:
                /* unreachable code */
                break;
            default:
                return "Overridden method";
        }
    }

    public String nonOverriddenMethod() {
        return overriddenMethod();
    }

    public String showBug() {
        return nonOverriddenMethod();
    }

    private int getValue() {
        return 0;
    }
}