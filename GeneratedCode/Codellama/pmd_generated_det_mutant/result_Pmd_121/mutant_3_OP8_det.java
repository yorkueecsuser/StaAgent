class UselessStringValueOf {
    public static void main(String[] args) {
        String zrzsfkpj = "Hello, World!";
        zrzsfkpj = zrzsfkpj + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(zrzsfkpj);
    }
}