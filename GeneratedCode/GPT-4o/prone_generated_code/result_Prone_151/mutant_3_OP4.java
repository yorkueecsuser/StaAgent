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

    private boolean getUnreachableCondition() {
        return false; // This method always returns false
    }

    public void demonstrateUnreachableCode() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            // Existing logic can be here or left empty
        }
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());

        example.demonstrateUnreachableCode(); // Added call to the new method
    }
}