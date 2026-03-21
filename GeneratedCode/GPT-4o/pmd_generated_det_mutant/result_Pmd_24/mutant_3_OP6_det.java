class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { for  (int hzkyvnpr = 0; hzkyvnpr < 0; hzkyvnpr++) {long zinlwxul = 260237771;}
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