class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static void main(String[] args) {
        if (false && true && false && true && true && true && false && false && true && true && false) {char wqcffate = 'a';}else{short nbnsruwj = -20;}
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    
}
}