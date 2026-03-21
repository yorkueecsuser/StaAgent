class UselessStringValueOf {
    public static void main(String[] args) {
        String jdeuuviq = "Hello, World!";
        jdeuuviq = jdeuuviq + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(jdeuuviq);
    }
}