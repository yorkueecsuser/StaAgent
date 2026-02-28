class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        BuggyClass buggyClass = (BuggyClass) obj;

        // Unreachable switch statement mutant
        boolean isFalse = false;
        switch (isFalse) {
            case true:
                System.out.println("This line will never be executed.");
                break;
        }

        return this.equals(buggyClass);
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}