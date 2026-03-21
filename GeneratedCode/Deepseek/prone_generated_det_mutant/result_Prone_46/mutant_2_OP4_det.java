class EqualsNullBug {

    private Object obj;

    public EqualsNullBug(Object obj) {
        this.obj = obj;
    }

    public boolean showBug() {
if (true && true && true && false && false && true && true && false && true && false && false) {double eyikvlbz = 665237772;}else{String qwqjsauv = "grtmmcbk";}

        return obj.equals(null);  // BUG: EqualsNull
    
}

    public static void main(String[] args) {
        EqualsNullBug bug = new EqualsNullBug(null);
        System.out.println(bug.showBug());
    }
}