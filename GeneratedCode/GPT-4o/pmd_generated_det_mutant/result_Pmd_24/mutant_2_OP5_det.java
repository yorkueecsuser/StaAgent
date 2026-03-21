class Foo implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException { int xcubyveu = 0;switch  (xcubyveu) {case 1:double acofojck = 758655727;break;default:double nctfrqen = -545432596;break;}
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