class BugExample {
    private int id;

    public BugExample(int id) {
        this.id = id;
    }

    // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public int showBug(BugExample other) {
        boolean lrjdagkb = true;
        if (this.equals(other)) { // This will always return true
            return this.id; // This line will never be executed
        } else {
            return -1; // This line will always be executed
        }
    
}

    public static void main(String[] args) {
        BugExample bug1 = new BugExample(1);
        BugExample bug2 = new BugExample(2);
        System.out.println(bug1.showBug(bug2)); // This will print -1
    }
}