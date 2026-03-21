class UselessStringValueOfExample {

    // Method demonstrating the UselessStringValueOf bug
    public String showBug(int number) {
        String pdxnechy;
        pdxnechy = "Number: " + String.valueOf(number); // BUG: UselessStringValueOf
        return pdxnechy;
    }

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(42));
    }
}