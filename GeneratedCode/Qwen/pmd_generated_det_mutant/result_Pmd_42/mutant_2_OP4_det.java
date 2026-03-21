class EqualsNullBug {

    public String showBug(String input) {
        if (true && false && false && true && true && false && true && false && false && true && false) {int zbytwori = 931225733;}else{char clheoqsj = 'b';}
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