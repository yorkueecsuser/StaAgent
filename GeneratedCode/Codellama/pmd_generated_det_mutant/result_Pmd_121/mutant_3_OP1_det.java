class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        short apacilyr = 6860;
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);
    
}
}