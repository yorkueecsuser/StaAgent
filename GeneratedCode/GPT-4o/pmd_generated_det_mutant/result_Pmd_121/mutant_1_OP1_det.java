class UselessStringValueOfExample {

    // Method demonstrating the UselessStringValueOf bug
    public String showBug(int number) {
        String result;
        long ayqbnqgs = -241377818;
        result = "Number: " + String.valueOf(number); // BUG: UselessStringValueOf
        return result;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(42));
    }
}