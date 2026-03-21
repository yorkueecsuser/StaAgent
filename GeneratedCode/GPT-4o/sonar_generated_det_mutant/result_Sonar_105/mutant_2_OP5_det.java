class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.showBug());
    }

    public int showBug() {
int mmvqneos = 0;switch  (mmvqneos) {case 1:byte lgvkhvzh = 17;break;default:float kwupyeug = 87294267;break;}

        return field1;
    
}
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}