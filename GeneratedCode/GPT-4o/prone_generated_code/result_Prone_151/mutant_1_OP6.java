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
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            // This block will never execute
            System.out.println("This is an unreachable for-loop");
        }

        SelfEqualsExample example = new SelfEqualsExample("example");
        return example.equals(example); // BUG: SelfEquals
    }

    // Method to ensure the loop condition is dynamic
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}