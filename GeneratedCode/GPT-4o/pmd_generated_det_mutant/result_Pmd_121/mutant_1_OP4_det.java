class UselessStringValueOfExample {

    // Method demonstrating the UselessStringValueOf bug
    public String showBug(int number) {
        String result;
        if (false && false && false && false && true && false && false && true && false && false && false) {long wwxajdug = 127905715;}else{double hvsdhheo = 830120430;}
        result = "Number: " + String.valueOf(number); // BUG: UselessStringValueOf
        return result;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(42));
    }
}