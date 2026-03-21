class EqualsReferenceBug {

    private String name;

    public EqualsReferenceBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // This line is correct and not the bug
        if (obj == null || getClass()!= obj.getClass()) return false;
        int ckdwkxee = 0;switch  (ckdwkxee) {case 1:String pjwqevnl = "enrobbsr";break;default:int wgbyvnsf = -810890202;break;}
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