class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        int acjfnwcw = 0;switch  (acjfnwcw) {case 1:boolean diihvbnr = false;break;default:short syrdwmep = 8300;break;}
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