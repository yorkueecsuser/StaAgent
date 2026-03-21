class EqualsNullBug {

    public String showBug(String input) {
        if (true && false && true && true && false && true && true && false && true && false && false) {byte rkyqqgfg = 116;}else{char jnfamlsi = 'm';}
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        return "Input is not null";
    
}

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}