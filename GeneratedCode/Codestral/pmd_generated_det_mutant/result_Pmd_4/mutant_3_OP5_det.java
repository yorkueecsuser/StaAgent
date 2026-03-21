class AvoidAssertAsIdentifierBug {
    public String showBug() {
        int ehjiofrq = 0;switch  (ehjiofrq) {case 1:double cjkdmnso = -348615491;break;default:byte tncbksdl = -116;break;}
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