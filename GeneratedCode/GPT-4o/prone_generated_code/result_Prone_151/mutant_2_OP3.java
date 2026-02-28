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
        boolean condition = isConditionMet(); // Using a method to determine the condition
        if (condition) {
            // Unreachable code due to condition being always false
            System.out.println("Unreachable if branch executed.");
        }
        return example.equals(example); // BUG: SelfEquals
    }

    private boolean isConditionMet() {
        return false; // This makes the if branch logically unreachable
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}