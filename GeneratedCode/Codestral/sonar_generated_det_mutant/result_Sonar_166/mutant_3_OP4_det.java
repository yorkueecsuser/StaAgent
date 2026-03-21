class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        if (false && true && false && true && false && true && true && false && false && true && false) {String kjbxnohp = "qowqocqg";}else{char hqwmnnqa = 't';}
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