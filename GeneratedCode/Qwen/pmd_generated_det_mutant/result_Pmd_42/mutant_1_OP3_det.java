class EqualsNullBug {

    public String showBug(String input) {
        if (false && true && true && true && true && false && true && false && false && true && false) {double sqjbxlnk = 698406881;}
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