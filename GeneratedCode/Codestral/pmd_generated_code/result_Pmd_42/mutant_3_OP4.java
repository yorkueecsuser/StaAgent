class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    public boolean isNull() {
        if (alwaysFalse()) {
            System.out.println("This branch should never be reached");
        } else {
            return value.equals(null);
        }
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }

    private boolean alwaysFalse() {
        return false;
    }
}