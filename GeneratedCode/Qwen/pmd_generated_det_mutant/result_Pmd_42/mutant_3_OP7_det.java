class EqualsNullBug {

    public String showBug(String input) {
        boolean xyjzkntn = false;while (xyjzkntn && true && false && true && false && true && true && true && false && true && true && false) {boolean slqjwkda = true;}
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