class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { for  (int yzizdujw = 0; yzizdujw < 0; yzizdujw++) {boolean jrpxsara = true;}
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