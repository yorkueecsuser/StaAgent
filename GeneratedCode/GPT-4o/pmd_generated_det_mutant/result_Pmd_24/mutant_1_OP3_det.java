class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { if (false && false && true && false && true && false && false && false && false && false && false) {char fahqnkoa = 'g';}
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