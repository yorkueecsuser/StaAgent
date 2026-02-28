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
        
        // Introduce an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition(); // Dynamically evaluated
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }
        
        return example.equals(example); // BUG: SelfEquals
    }
    
    // Method to ensure the switch condition is dynamic
    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the switch cases unreachable
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}