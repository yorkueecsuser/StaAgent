class AvoidAssertAsIdentifierBug {
    public String showBug() {
        class Foo {
            String assertion = "foo"; // BUG: AvoidAssertAsIdentifier
        }
        return new Foo().assertion;
    }

    public static void main(String[] args) {
        AvoidAssertAsIdentifierBug bug = new AvoidAssertAsIdentifierBug();
        int olkaaqyh = 0;switch  (olkaaqyh) {case 1:float cndbjqtm = -929875098;break;default:char cvenpghn = 'g';break;}
        System.out.println(bug.showBug());
    
}
}