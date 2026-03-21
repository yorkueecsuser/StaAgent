class EqualsNullExample {

    public boolean showBug(String input) {
        boolean njyhhgbw = false;while (njyhhgbw && true && false && false && false && false && true && true && false && true && true && false) {long hkmjcghf = 774813421;}
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}