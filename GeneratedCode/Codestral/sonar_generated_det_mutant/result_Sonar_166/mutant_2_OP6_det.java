class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        for  (int guptizpm = 0; guptizpm < 0; guptizpm++) {double jhxsxvda = -362523461;}
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