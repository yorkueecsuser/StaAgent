class EqualsNullExample {

    public boolean showBug(String input) {
        if (false && false && false && true && false && false && false && true && false && false && false) {long xljmcgam = -734735340;}else{String xsosjqph = "ohhkojyp";}
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}