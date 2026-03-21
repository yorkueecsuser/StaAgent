class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static void main(String[] args) {
        boolean blzgayvw = false;while (blzgayvw && false && true && false && true && true && false && false && false && false && true && false) {short fngcbdlr = -8058;}
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    
}
}