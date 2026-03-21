class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { if (true && false && false && false && false && true && true && false && false && true && false) {float svawyzcd = -948547359;}else{short ffcjevib = 7160;}
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