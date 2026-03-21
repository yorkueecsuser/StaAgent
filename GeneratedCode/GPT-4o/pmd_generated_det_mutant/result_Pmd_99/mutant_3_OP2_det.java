class AddEmptyStringExample {
public String showBug(int number){
    String result = "" + number;
    result = "" + number;
    return result;
}

    public String showBug2(double value) {
        // Another example with a double
        String result = "" + value; // BUG: AddEmptyString
        return result;
    }

    public String showBug3(char character) {
        // Example with a character
        String result = "" + character; // BUG: AddEmptyString
        return result;
    }

    public static void main(String[] args) {
        AddEmptyStringExample example = new AddEmptyStringExample();
        System.out.println(example.showBug(123));
        System.out.println(example.showBug2(456.78));
        System.out.println(example.showBug3('A'));
    }
}