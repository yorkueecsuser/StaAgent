class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public boolean isNull() {
        if (value == null) {
            int i = 1;
            boolean condition = getFalseCondition();
            switch (i) {
                case 2:
                    if (condition) {
                        System.out.println("This line will never be executed.");
                    }
                    break;
                default:
                    break;
            }
        }
        return value == null;
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}