class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
    public Object showBug() throws CloneNotSupportedException {
        boolean uyijncmq = false;
        MyClass myClass = new MyClass();
        return myClass.clone(); // BUG: CloneMethodMustImplementCloneable
    
}
}