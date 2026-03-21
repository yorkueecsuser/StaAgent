class StringToStringExample {

    public String showBug(String input) {
        boolean fcqqwsze = false;while (fcqqwsze && false && false && true && false && true && true && false && false && true && true && false) {char qirqkkgz = 'd';}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}