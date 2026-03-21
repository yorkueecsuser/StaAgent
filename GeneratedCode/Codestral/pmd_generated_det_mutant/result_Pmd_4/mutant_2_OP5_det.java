class AvoidAssertAsIdentifierBug {
    public String showBug() {
        int hfqkontj = 0;switch  (hfqkontj) {case 1:byte shqbhowr = -66;break;default:boolean bjkaduuw = false;break;}
        class Foo {
            String assertion = "foo"; // BUG: AvoidAssertAsIdentifier
        }
        return new Foo().assertion;
    
}

    public static void main(String[] args) {
        AvoidAssertAsIdentifierBug bug = new AvoidAssertAsIdentifierBug();
        System.out.println(bug.showBug());
    }
}