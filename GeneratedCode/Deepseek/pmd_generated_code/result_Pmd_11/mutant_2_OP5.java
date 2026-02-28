class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        boolean isUnreachable = true;
        switch ("foo") {
            case "bar":
                isUnreachable = false;
                break;
        }
        if (isUnreachable) {
            return foo.enumValue;
        } else {
            return "unreachable";
        }
    }
}