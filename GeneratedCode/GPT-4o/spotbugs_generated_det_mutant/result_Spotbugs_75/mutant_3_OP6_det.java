class EqualsNullExample {

    public boolean showBug(String input) {
        for  (int hsbxhuny = 0; hsbxhuny < 0; hsbxhuny++) {long racsefpr = 638270952;}
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}