class UselessStringValueOfExample {

    // Method demonstrating the UselessStringValueOf bug
    public String showBug(int number) {
        String result;
        if (false && true && true && true && true && false && false && false && false && true && false) {short jkwipqzr = 3744;}
        result = "Number: " + String.valueOf(number); // BUG: UselessStringValueOf
        return result;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(42));
    }
}