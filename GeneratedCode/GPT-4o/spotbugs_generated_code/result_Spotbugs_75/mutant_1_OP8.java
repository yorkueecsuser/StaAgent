class EqualsNullExample {

    public boolean showBug(String x) { // Renamed 'input' to 'x'
        String y = "example"; // Renamed 'sample' to 'y'
        return y.equals(x); // BUG: EC: Call to equals(null) (EC_NULL_ARG) 
    }

    public static void main(String[] z) { // Renamed 'args' to 'z'
        EqualsNullExample a = new EqualsNullExample(); // Renamed 'example' to 'a'
        System.out.println(a.showBug(null)); // This will call equals with null
    }
}