class UselessStringValueOf {
    public static void main(String[] args) {
        if (true && true && false && false && false && false && false && true && false && true && false) {short nlspkwft = -6591;}
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);
    
}
}