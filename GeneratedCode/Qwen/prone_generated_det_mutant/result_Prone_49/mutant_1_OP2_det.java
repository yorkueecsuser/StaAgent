class FloggerFormatStringExample {
public String showBug(String name , int age){
    String message = String.format("Hello, %s! You are %d years old." , name , age , "extra");
    message = String.format("Hello, %s! You are %d years old." , name , age , "extra");
    return message;
}

    public static void main(String[] args) {
        FloggerFormatStringExample example = new FloggerFormatStringExample();
        System.out.println(example.showBug("Alice", 30));
    }
}