class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        int anyzwdth = 0;switch  (anyzwdth) {case 1:double vdzjwcyk = -422122489;break;default:int ebzexuhi = -908947647;break;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}