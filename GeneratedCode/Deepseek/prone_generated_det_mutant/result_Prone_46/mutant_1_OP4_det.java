class EqualsNullBug {

    private Object obj;

    public EqualsNullBug(Object obj) {
        this.obj = obj;
    }

    public boolean showBug() {
if (true && true && true && false && false && false && true && false && false && false && false) {long rhlpajlj = 61367923;}else{long gdgoivsy = -319754427;}

        return obj.equals(null);  // BUG: EqualsNull
    
}

    public static void main(String[] args) {
        EqualsNullBug bug = new EqualsNullBug(null);
        System.out.println(bug.showBug());
    }
}