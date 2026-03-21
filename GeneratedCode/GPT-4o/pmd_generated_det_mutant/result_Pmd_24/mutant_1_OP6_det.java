class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { for  (int montjszg = 0; montjszg < 0; montjszg++) {char dabrspws = 'n';}
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