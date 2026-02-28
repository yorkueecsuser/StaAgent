class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        BuggyClass buggyClass = (BuggyClass) obj;
        boolean condition = getUnreachableCondition();
        switch (condition) {
            case true:
                // this case will never be executed
                break;
            default:
                return this.equals(buggyClass);
        }
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}