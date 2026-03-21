class UselessStringValueOf {
    public static void main(String[] args) {
        if (true && true && false && true && true && true && true && true && true && true && false) {float hdtcewwl = 265551895;}
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);
    
}
}