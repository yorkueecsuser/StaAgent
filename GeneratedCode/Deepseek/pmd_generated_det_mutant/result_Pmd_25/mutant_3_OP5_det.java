class MyClass {

    public Object clone() throws CloneNotSupportedException {
int kfgivejm = 0;switch  (kfgivejm) {case 1:long oqwwmkxt = -783208082;break;default:int vgmfxpaj = -714543540;break;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}