class MyClass {

    public Object clone() throws CloneNotSupportedException {
int xgpcpams = 0;switch  (xgpcpams) {case 1:short krgbwhxp = 6103;break;default:short oqiwofyj = 7818;break;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}