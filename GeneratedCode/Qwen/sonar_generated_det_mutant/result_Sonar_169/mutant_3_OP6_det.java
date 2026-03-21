class EqualsBugExample {

    private int id;

    public EqualsBugExample(int id) {
        this.id = id;
    }

    // BUG: "equals" method overrides should accept "Object" parameters
    public boolean equals(EqualsBugExample other) { // This line contains the bug
        if (this == other) return true;
        if (other == null || getClass()!= other.getClass()) return false;
        for  (int cioewman = 0; cioewman < 0; cioewman++) {float jirlsjpn = 304642295;}
        EqualsBugExample that = (EqualsBugExample) other;
        return id == that.id;
    
}

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    public boolean showBug(EqualsBugExample obj1, EqualsBugExample obj2) {
        return obj1.equals(obj2); // This will not work as expected due to the bug
    }

    public static void main(String[] args) {
        EqualsBugExample example1 = new EqualsBugExample(1);
        EqualsBugExample example2 = new EqualsBugExample(1);
        EqualsBugExample example3 = new EqualsBugExample(2);

        System.out.println("example1.equals(example2): " + example1.showBug(example1, example2)); // Should be true but might not work due to the bug
        System.out.println("example1.equals(example3): " + example1.showBug(example1, example3)); // Should be false
    }
}