class EqualsNullBug {

    private Object obj;

    public EqualsNullBug(Object obj) {
        this.obj = obj;
    }

    public boolean showBug() {
int tylabbbf = 0;switch  (tylabbbf) {case 1:double guggbfai = 277128579;break;default:float okswjoye = -162240399;break;}

        return obj.equals(null);  // BUG: EqualsNull
    
}

    public static void main(String[] args) {
        EqualsNullBug bug = new EqualsNullBug(null);
        System.out.println(bug.showBug());
    }
}