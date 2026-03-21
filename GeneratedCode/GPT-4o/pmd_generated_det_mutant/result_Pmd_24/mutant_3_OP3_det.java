class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { if (true && true && true && true && true && true && false && false && false && true && false) {boolean vgnzyxny = false;}
 // BUG: CloneMethodMustBePublic
        return super.clone();
    
}
    
    public Object showBug() {
        try {
            return this.clone(); // This will call the protected clone method
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}