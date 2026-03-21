class StringToStringExample {

    public String showBug(String input) {
        if (false && true && false && false && false && true && true && false && true && false && false) {byte zomnvzsa = -29;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}