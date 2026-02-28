class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        int abcdexyz = 42; // Dead Store: Unused variable declaration added
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}