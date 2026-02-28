class SelfEqualsExample {
    
    private String name;

    public SelfEqualsExample(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelfEqualsExample that = (SelfEqualsExample) obj;
        return name.equals(that.name);
    }

    public boolean showBug() {
        SelfEqualsExample example = new SelfEqualsExample("example");
        return example.equals(example); // BUG: SelfEquals
    }

    private int getCondition() {
        return 1; // This method will always return 1
    }

    public void unreachableSwitchExample() {
        int condition = getCondition(); // Initialize the condition dynamically
        switch (condition) {
            case 0:
                System.out.println("This is unreachable");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
        
        example.unreachableSwitchExample(); // Call to the method containing the unreachable switch
    }
}