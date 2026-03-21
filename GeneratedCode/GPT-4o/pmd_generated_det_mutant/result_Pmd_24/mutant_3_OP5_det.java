class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { int rkmbzogc = 0;switch  (rkmbzogc) {case 1:short bpbzhngc = 6356;break;default:long wtfffegf = 698511382;break;}
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