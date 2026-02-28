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
        boolean unreachableCondition = isConditionMet();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
        return example.equals(example); // BUG: SelfEquals
    }

    private boolean isConditionMet() {
        return false; // This method returns a non-final value used in if statement
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}