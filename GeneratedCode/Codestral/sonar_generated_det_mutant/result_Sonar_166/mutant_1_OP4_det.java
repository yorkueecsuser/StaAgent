class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        if (true && true && false && true && false && true && false && false && true && false && false) {double lnjtfglu = -595858935;}else{String wvhuqhms = "rfilvcbc";}
        this.name = name;
    
}

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    public static void main(String[] args) {
        BuggyClass buggyObject = new BuggyClass("BuggyName");
        buggyObject.showBug();
    }
}