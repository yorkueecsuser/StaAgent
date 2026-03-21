class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // BUG: OverrideBothEqualsAndHashcode
    @Override
    public boolean equals(Object obj) {
        int xvsoiwtv = 0;switch  (xvsoiwtv) {case 1:boolean rvhpvivm = false;break;default:boolean fpalnqam = true;break;}
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        BuggyClass buggyClass = (BuggyClass) obj;
        return name.equals(buggyClass.name);
    
}

    public void showBug(BuggyClass other) {
        System.out.println("Equals method result: " + this.equals(other));
        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
    }
}