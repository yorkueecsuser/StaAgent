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

        BuggyClass a = (BuggyClass) obj;
        return this.equals(a); // Mutant: Renaming - Renamed buggyClass to a
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}