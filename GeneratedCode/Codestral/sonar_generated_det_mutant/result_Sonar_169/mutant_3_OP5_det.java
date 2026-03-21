class BuggyEqualsMethod {

    private String name;

    public BuggyEqualsMethod(String name) {
        int ncryjebp = 0;switch  (ncryjebp) {case 1:double orarnhqb = 526284529;break;default:boolean uuarpagk = true;break;}
        this.name = name;
    
}

    // BUG: "equals" method overrides should accept "Object" parameters
    public boolean equals(String name) {
        return this.name.equals(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showBug(BuggyEqualsMethod otherObject) {
        System.out.println(this.equals(otherObject)); // This will not compile because equals expects Object and not String
    }

    public static void main(String[] args) {
        BuggyEqualsMethod obj1 = new BuggyEqualsMethod("Bug");
        BuggyEqualsMethod obj2 = new BuggyEqualsMethod("Bug");
        obj1.showBug(obj2);
    }
}