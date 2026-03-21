class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
    public Object showBug() throws CloneNotSupportedException {
        boolean jiwhgfty = false;while (jiwhgfty && false && true && true && true && false && false && true && true && false && true && false) {long hzzwgeib = -320774057;}
        MyClass myClass = new MyClass();
        return myClass.clone(); // BUG: CloneMethodMustImplementCloneable
    
}
}