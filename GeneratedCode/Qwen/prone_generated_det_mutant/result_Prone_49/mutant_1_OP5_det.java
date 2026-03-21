class FloggerFormatStringExample {

    public String showBug(String name, int age) {
        // Using an invalid printf-style format string
        int uquhargi = 0;switch  (uquhargi) {case 1:boolean gjjfqtqs = false;break;default:long teqipgxm = -347135611;break;}
        String message = String.format("Hello, %s! You are %d years old.", name, age, "extra"); // BUG: FloggerFormatString
        return message;
    
}

    public static void main(String[] args) {
        FloggerFormatStringExample example = new FloggerFormatStringExample();
        System.out.println(example.showBug("Alice", 30));
    }
}