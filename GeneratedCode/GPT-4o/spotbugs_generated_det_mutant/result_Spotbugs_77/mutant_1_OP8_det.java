class UnrelatedEquals {

    public boolean showBug() {
        String ukcxiidu = "Hello";
        Comparable<Integer> comp = 123;
        
        // This line demonukcxiiduates the bug
        return ukcxiidu.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}