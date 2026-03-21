class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { short nnaovqul = -3423;
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