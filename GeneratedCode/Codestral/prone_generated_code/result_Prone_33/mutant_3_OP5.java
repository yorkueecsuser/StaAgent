class DereferenceWithNullBranchBug {

    private String potentialNullString;

    public DereferenceWithNullBranchBug(String potentialNullString) {
        this.potentialNullString = potentialNullString;
    }

    public int showBug() {
        // BUG: DereferenceWithNullBranch
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        return potentialNullString.length();
    }

    private int getValue() {
        return 0;
    }
}