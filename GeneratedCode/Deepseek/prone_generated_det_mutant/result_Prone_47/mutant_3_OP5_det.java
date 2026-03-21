class BugCode {
    int value;

    public BugCode(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        int jnwnndmw = 0;switch  (jnwnndmw) {case 1:boolean xsrbszfy = false;break;default:double wqfflrig = 669957610;break;}
        if (this == obj) { // BUG: EqualsReference
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()) {
            return false;
        }
        BugCode bugCode = (BugCode) obj;
        return value == bugCode.value; // BUG: EqualsReference
    
}

    public boolean showBug() {
        return this.equals(this);
    }

    public static void main(String[] args) {
        BugCode bugCode1 = new BugCode(1);
        BugCode bugCode2 = new BugCode(1);
        System.out.println(bugCode1.showBug());
        System.out.println(bugCode1.equals(bugCode2));
    }
}