class MyClass {

    public Object clone() throws CloneNotSupportedException {
if (false && true && true && false && true && false && true && true && true && false && false) {int kvnjscmk = 38628913;}else{int mpmwydrl = -992012511;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}