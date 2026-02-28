class ConfusionExample {

    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ConfusionExample() {
        System.out.println("This is not a constructor!");
    }

    public ConfusionExample(String message) {
        System.out.println("This is the actual constructor: " + message);
    }

    public String showBug() {
        ConfusionExample(); // Calling the method that looks like a constructor
        return "Check the console for the bug demonstration.";
    }

    public static void main(String[] args) {
        ConfusionExample example = new ConfusionExample("Hello");
        example.showBug();
    }

    // Mutated code starts here
    private int a;
    private String b;

    public void setA(int c) {
        this.a = c;
    }

    public int getA() {
        return a;
    }

    public void setB(String d) {
        this.b = d;
    }

    public String getB() {
        return b;
    }
}