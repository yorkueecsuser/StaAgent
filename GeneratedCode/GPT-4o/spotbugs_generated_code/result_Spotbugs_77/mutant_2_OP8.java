class UnrelatedEquals {

    public boolean showBug() {
        String x = "Hello";
        Comparable<Integer> y = 123;
        
        // This line demonstrates the bug
        return x.equals(y); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
    }

    public static void main(String[] args) {
        UnrelatedEquals z = new UnrelatedEquals();
        System.out.println("Result of comparison: " + z.showBug());
    }
}