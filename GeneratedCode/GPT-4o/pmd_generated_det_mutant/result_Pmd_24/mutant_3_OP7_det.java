class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { boolean lsbyjqeq = false;while (lsbyjqeq && true && true && false && false && true && true && false && true && false && true && false) {double vdltauth = -49209610;}
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