class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    public boolean isNull() {
        boolean condition = getFalseCondition();
        switch(condition) {
            case true:
                // Unreachable code
                System.out.println("This is unreachable code");
                break;
        }
        return value.equals(null);
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}