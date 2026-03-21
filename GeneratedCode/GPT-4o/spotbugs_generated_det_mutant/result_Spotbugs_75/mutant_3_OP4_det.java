class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static void main(String[] args) {
        if (true && true && false && true && true && true && true && false && true && false && false) {double hswzcspf = 47250428;}else{short coegkmki = -5915;}
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    
}
}