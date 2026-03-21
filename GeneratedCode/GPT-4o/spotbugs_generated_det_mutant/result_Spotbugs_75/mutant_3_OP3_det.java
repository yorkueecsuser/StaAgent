class EqualsNullExample {

    public boolean showBug(String input) {
        if (true && true && true && true && false && true && true && true && false && false && false) {long avpusyia = 919552947;}
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}