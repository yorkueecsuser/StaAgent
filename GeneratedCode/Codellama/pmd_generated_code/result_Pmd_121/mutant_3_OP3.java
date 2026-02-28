class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10);
        boolean condition = getCondition();
        if (condition) {
            str = str + String.valueOf(20);
        } else {
            str = str + String.valueOf(30);
        }
        System.out.println(str);
    }
    
    public static boolean getCondition() {
        return false;
    }
}