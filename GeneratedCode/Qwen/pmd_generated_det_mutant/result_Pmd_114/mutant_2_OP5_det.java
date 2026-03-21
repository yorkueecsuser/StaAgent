class StringToStringBug {

    public String showBug(String input) {
int smqwjapp = 0;switch  (smqwjapp) {case 1:int bbxlpxdy = 408740572;break;default:int dzndzlky = -312563341;break;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}