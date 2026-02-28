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

        // Unreachable for loop with dynamic condition
        boolean neverTrue = isConditionFalse();
        for (int i = 0; neverTrue; i++) {
            System.out.println("This will never be printed.");
        }

        return example.equals(example); // BUG: SelfEquals
    }

    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}