class StringToStringExample {

    public String showBug(String input) {
        for  (int psidspnu = 0; psidspnu < 0; psidspnu++) {String otpdkodv = "dmtutzlk";}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}