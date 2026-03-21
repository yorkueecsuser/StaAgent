class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { boolean tnhxgeqa = false;while (tnhxgeqa && true && false && true && false && false && false && true && true && false && true && false) {long dfzxxrwb = -898097365;}
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