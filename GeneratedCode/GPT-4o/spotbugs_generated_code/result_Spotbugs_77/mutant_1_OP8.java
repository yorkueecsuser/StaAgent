class UnrelatedEquals {

    public boolean showBug() {
        String a = "Hello"; // Renamed variable from 'str' to 'a'
        Comparable<Integer> b = 123; // Renamed variable from 'comp' to 'b'
        
        // This line demonstrates the bug
        return a.equals(b); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
    }

    public static void main(String[] args) {
        UnrelatedEquals c = new UnrelatedEquals(); // Renamed variable from 'example' to 'c'
        System.out.println("Result of comparison: " + c.showBug());
    }
}