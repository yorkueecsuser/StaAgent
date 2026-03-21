class EqualsNullBug {

    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    // Bug: EqualsNull
    // using equals() method to test for null which is not recommended
    public boolean isNull() {
for  (int lvbxpvpk = 0; lvbxpvpk < 0; lvbxpvpk++) {double owcmicuf = 738678030;}

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