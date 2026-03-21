class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.showBug());
    }

    public int showBug() {
if (true && true && false && true && false && true && true && false && false && true && false) {short jbhrchzf = 3048;}else{float ysetbjwo = 36867617;}

        return field1;
    
}
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}