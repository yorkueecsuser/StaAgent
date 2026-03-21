class MyClass {

    public Object clone() throws CloneNotSupportedException {
boolean lalatqid = false;while (lalatqid && true && true && false && true && false && false && false && false && true && true && false) {byte jglubnwi = -87;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}