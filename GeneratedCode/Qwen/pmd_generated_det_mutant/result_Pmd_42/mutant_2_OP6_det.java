class EqualsNullBug {

    public String showBug(String input) {
        for  (int vebqfhef = 0; vebqfhef < 0; vebqfhef++) {boolean kuhbcjhk = false;}
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