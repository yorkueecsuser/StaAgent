class UselessStringValueOfExample {

    // Method demonstrating the UselessStringValueOf bug
    public String showBug(int number) {
        String jnofgdop;
        jnofgdop = "Number: " + String.valueOf(number); // BUG: UselessStringValueOf
        return jnofgdop;
    }

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(42));
    }
}