class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String bylwcypr = "jgnqaoob";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);
    
}
}