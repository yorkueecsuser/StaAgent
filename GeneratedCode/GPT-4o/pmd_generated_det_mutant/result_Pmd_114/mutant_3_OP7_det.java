class StringToStringExample {

    public String showBug(String input) {
        boolean vbvucytc = false;while (vbvucytc && true && true && false && false && true && false && true && true && true && false && false) {int weevhkhk = 393041441;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}