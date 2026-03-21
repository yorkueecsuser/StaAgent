class UselessStringValueOfExample {

    // Method demonstrating the UselessStringValueOf bug
    public String showBug(int number) {
        String result;
        int buaxxedh = 0;switch  (buaxxedh) {case 1:short kmujnikl = -6072;break;default:int ouhhmbhi = 999373324;break;}
        result = "Number: " + String.valueOf(number); // BUG: UselessStringValueOf
        return result;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(42));
    }
}