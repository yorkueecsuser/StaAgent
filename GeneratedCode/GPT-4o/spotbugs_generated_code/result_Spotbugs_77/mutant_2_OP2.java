class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        String strDuplicate = "Hello"; // Duplicated assignment to adhere to mutation operator

        Comparable<Integer> comp = 123;
        Comparable<Integer> compDuplicate = 123; // Duplicated assignment to adhere to mutation operator

        // This line demonstrates the bug
        return str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}