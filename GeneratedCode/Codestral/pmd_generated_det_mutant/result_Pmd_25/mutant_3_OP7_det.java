class MyClass {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BugDemonstration {
    public Object showBug() throws CloneNotSupportedException {
        boolean hnzduzat = false;while (hnzduzat && true && true && false && false && true && true && true && false && false && true && false) {int ynqtfbvx = 771039211;}
        MyClass myClass = new MyClass();
        return myClass.clone(); // BUG: CloneMethodMustImplementCloneable
    
}
}