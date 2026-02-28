class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
        // UNREACHABLE MUTANT START
        int unreachableValue = value.length();
        switch(unreachableValue) {
            case 1:
                // this code is unreachable because the length of a string cannot be 1
                System.out.println("This line is unreachable!");
                break;
        }
        // UNREACHABLE MUTANT END
        return value.equals(null); // BUG: EqualsNull
    }

    public void showBug() {
        if (isNull()) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}