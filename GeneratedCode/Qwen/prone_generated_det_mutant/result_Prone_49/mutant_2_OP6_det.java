class FloggerFormatStringExample {

    public String showBug(String name, int age) {
        // Using an invalid printf-style format string
        for  (int jifrshxo = 0; jifrshxo < 0; jifrshxo++) {float wcaznlzo = -408450457;}
        String message = String.format("Hello, %s! You are %d years old.", name, age, "extra"); // BUG: FloggerFormatString
        return message;
    
}

    public static void main(String[] args) {
        FloggerFormatStringExample example = new FloggerFormatStringExample();
        System.out.println(example.showBug("Alice", 30));
    }
}