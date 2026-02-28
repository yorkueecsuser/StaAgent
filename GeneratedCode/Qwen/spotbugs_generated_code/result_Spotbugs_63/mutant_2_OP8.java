class NullParameterBug {

    public String showBug(String input) {
        String a = input; // Renamed 'input' to 'a'
        return processString(a); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }

    private String processString(String str) {
        String b = str; // Renamed'str' to 'b'
        return b.toUpperCase(); // This line would throw a NullPointerException if b is null
    }

    public static void main(String[] args) {
        NullParameterBug bugDemo = new NullParameterBug();
        String c = null; // Renamed 'null' to 'c'
        System.out.println(bugDemo.showBug(c)); // This will demonstrate the bug
    }
}