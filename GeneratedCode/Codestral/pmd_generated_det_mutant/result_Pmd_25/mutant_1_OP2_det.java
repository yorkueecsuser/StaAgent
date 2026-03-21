class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
public Object showBug() throws CloneNotSupportedException {
    MyClass myClass = new MyClass();
    myClass = new MyClass();
    return myClass.clone();
}
}