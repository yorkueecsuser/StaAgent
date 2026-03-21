class StringToStringExample {

    public String showBug(String input) {
        if (false && true && true && true && false && true && false && true && false && true && false) {short cmfoexuf = -7979;}else{int buwayxxb = 873021550;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}