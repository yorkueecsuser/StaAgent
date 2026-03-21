class StringToStringExample {

    public String showBug(String input) {
        if (true && false && false && true && false && true && true && false && false && false && false) {byte afwnepad = 78;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}