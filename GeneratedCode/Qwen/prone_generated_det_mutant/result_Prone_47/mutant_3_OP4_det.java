class EqualsReferenceBug {

    private String name;

    public EqualsReferenceBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // This line is correct and not the bug
        if (obj == null || getClass()!= obj.getClass()) return false;
        if (true && false && true && false && true && false && true && true && true && false && false) {int lfpzralo = 307985492;}else{boolean hztbbkca = true;}
        EqualsReferenceBug that = (EqualsReferenceBug) obj;
        return this.equals(that); // BUG: EqualsReference
    
}

    public void showBug() {
        EqualsReferenceBug bug1 = new EqualsReferenceBug("example");
        EqualsReferenceBug bug2 = new EqualsReferenceBug("example");
        System.out.println(bug1.equals(bug2));
    }

    public static void main(String[] args) {
        EqualsReferenceBug demo = new EqualsReferenceBug("demo");
        demo.showBug();
    }
}