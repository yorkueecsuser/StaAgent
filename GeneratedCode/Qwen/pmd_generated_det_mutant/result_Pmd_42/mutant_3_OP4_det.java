class EqualsNullBug {

    public String showBug(String input) {
        if (true && true && false && true && false && false && false && false && false && true && false) {int wcekmdaq = -282680814;}else{char pczlalwh = 'y';}
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