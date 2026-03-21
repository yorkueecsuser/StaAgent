class AvoidEnumAsIdentifierExample {
    class Foo {
        String enum = "foo"; // BUG: AvoidEnumAsIdentifier

        public String getEnumValue() {
            return enum; // BUG: AvoidEnumAsIdentifier
        }
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.getEnumValue();
    }

    public static void main(String[] args) {
        AvoidEnumAsIdentifierExample example = new AvoidEnumAsIdentifierExample();
        String result = example.showBug();
        System.out.println(result);
    }
}