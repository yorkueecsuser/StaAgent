class ConfigurableComponent {
    private String undefinedProperty;

    public void init() {
        // Added unreachable switch statement
        boolean shouldSwitch = getCondition();
        if (shouldSwitch) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This will never be printed");
                    break;
                default:
                    break;
            }
        }

        System.out.println(undefinedProperty);
    }

    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        return undefinedProperty;
    }
}