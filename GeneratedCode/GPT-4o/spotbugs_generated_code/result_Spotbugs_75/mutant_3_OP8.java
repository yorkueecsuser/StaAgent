class EqualsNullExample {

    public boolean showBug(String h) { // Renamed 'input' to 'h'
        String sample = "example";
        return sample.equals(h); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}