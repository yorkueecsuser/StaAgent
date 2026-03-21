class EqualsNullBug {

    public String showBug(String input) {
        for  (int zsibdyhb = 0; zsibdyhb < 0; zsibdyhb++) {char jqefzouu = 't';}
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