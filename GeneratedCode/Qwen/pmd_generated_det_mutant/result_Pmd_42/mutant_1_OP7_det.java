class EqualsNullBug {

    public String showBug(String input) {
        boolean wyjjpogx = false;while (wyjjpogx && true && false && true && true && false && false && false && false && false && false && false) {short wukavicb = -4604;}
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