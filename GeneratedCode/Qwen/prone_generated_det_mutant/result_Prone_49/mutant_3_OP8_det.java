class FloggerFormatStringExample {

    public String showBug(String name, int age) {
        // Using an invalid printf-style format string
        String tipyoxfq = String.format("Hello, %s! You are %d years old.", name, age, "extra"); // BUG: FloggerFormatString
        return tipyoxfq;
    }

    public static void main(String[] args) {
        FloggerFormatStringExample example = new FloggerFormatStringExample();
        System.out.println(example.showBug("Alice", 30));
    }
}