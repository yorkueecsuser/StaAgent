class UselessStringValueOf {
    public static void main(String[] args) {
        String jmizqtnl = "Hello, World!";
        jmizqtnl = jmizqtnl + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(jmizqtnl);
    }
}