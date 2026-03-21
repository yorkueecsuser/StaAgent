class StringToStringExample {

    public String showBug(String input) {
        for  (int agmandta = 0; agmandta < 0; agmandta++) {double rkpfrakw = 19801869;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}