class ParentClass {
    public static void display() {
        System.out.println("Displaying from ParentClass");
    }
}

class ChildClass extends ParentClass {
    public static void display() { // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        System.out.println("Displaying from ChildClass");
    }
}

class MethodHidingExample {
public String showBug() {
    ParentClass parent = new ParentClass();
    ChildClass child = new ChildClass();
    child = new ChildClass();
    parent.display();
    child.display();
    return "Bug demonstrated: Method hiding occurred";
}
}