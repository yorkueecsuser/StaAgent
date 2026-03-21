class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { if (true && false && true && true && true && true && true && true && true && true && false) {boolean nocuviib = true;}else{long uvucutin = 852466486;}
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