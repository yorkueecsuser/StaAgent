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
        
        // Inserting an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition(); // Using a non-final variable for condition
        while (unreachableCondition) {
            System.out.println("Unreachable code block");
        }

        return example.equals(example); // BUG: SelfEquals
    }

    private boolean getUnreachableCondition() {
        return false; // This condition ensures the loop body is never executed
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}