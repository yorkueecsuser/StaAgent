class EqualsNullBug {

    private Object obj;

    public EqualsNullBug(Object obj) {
        this.obj = obj;
    }

    public boolean showBug() {
short xzoqnfpa = 8631;

        return obj.equals(null);  // BUG: EqualsNull
    
}

    public static void main(String[] args) {
        EqualsNullBug bug = new EqualsNullBug(null);
        System.out.println(bug.showBug());
    }
}