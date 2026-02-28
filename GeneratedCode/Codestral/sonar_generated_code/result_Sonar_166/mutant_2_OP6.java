class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    public String tostring() {
        // Adding unreachable for loop
        boolean shouldLoop = false;
        for (int i = 0; shouldLoop; i++) {
            System.out.println("This loop will never execute");
        }

        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        System.out.println(this.tostring());
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}