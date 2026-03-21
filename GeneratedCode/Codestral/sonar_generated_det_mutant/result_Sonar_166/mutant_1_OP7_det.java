class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        boolean dfsjpgfm = false;while (dfsjpgfm && false && true && false && true && false && true && false && false && false && false && false) {short jfqklcpc = 8003;}
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