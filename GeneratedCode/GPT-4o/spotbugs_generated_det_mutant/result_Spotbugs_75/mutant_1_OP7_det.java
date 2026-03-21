class EqualsNullExample {

    public boolean showBug(String input) {
        boolean mefyeiwv = false;while (mefyeiwv && false && true && true && false && false && false && true && true && true && false && false) {long nvixbeky = 65917178;}
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}