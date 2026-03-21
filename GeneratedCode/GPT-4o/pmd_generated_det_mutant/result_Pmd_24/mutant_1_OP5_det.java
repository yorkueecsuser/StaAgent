class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { int rzuzzyte = 0;switch  (rzuzzyte) {case 1:short vzzizepc = -4245;break;default:short ttqxqbuu = -4325;break;}
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