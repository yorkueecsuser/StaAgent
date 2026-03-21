class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        int sbiyuqrf = 0;switch  (sbiyuqrf) {case 1:byte orwsocwc = 56;break;default:int hoswqntb = 214160695;break;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}