class EqualsNullBug {

    public String showBug(String input) {
        boolean honwayjz = false;while (honwayjz && true && false && true && false && false && false && true && false && true && true && false) {int yhekcarg = -529380214;}
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