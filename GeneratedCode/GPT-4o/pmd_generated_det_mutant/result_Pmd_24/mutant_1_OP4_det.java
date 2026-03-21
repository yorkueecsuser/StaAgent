class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { if (true && false && true && true && true && false && true && true && false && false && false) {char sdzdnthq = 'p';}else{int axqzjraj = -347264586;}
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