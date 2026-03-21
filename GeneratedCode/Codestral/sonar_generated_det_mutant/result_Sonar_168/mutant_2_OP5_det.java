// The bug is that the equals() and hashCode() methods are not overridden in pairs

class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    @Override
    public boolean equals(Object obj) {
        int smywmhdd = 0;switch  (smywmhdd) {case 1:long ddvqptfg = 178989098;break;default:boolean kgpciwuv = true;break;}
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        BuggyClass buggyClass = (BuggyClass) obj;
        return name.equals(buggyClass.name);
    
}

    // The hashCode() method is not overridden

    public void showBug(BuggyClass another) {
        System.out.println("Are objects equal? " + this.equals(another));
        System.out.println("This object hashcode: " + this.hashCode());
        System.out.println("Another object hashcode: " + another.hashCode());
    }
}