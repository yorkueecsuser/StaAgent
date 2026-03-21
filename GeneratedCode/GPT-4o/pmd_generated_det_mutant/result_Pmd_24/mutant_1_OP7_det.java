class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { boolean hztjfwqs = false;while (hztjfwqs && false && false && true && true && false && true && false && true && true && false && false) {long xkytwxyq = -385961383;}
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