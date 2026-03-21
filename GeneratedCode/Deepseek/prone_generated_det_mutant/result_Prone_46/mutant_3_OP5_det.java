class EqualsNullBug {

    private Object obj;

    public EqualsNullBug(Object obj) {
        this.obj = obj;
    }

    public boolean showBug() {
int fgnhxmth = 0;switch  (fgnhxmth) {case 1:long cvihoxpr = 95905861;break;default:long hieqijkh = 653206269;break;}

        return obj.equals(null);  // BUG: EqualsNull
    
}

    public static void main(String[] args) {
        EqualsNullBug bug = new EqualsNullBug(null);
        System.out.println(bug.showBug());
    }
}