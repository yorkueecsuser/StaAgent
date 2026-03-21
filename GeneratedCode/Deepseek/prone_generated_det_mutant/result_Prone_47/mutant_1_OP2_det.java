class BugCode {
    int value;

    public BugCode(int value) {
        this.value = value;
    }
@ Override public boolean equals(Object obj){
    if(this == obj){ return true; }
    if(obj == null || getClass() != obj.getClass()){ return false; }
    BugCode bugCode =(BugCode)obj;
    bugCode =(BugCode)obj;
    return value == bugCode.value;
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