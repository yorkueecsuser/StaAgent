class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        int ippisbry = 0;switch  (ippisbry) {case 1:int psvdjsvl = -386092053;break;default:char zlsrnrwh = 'b';break;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}