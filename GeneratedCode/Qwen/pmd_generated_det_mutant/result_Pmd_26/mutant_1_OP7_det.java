class CloneBugExample implements Cloneable {

    private int value;

    public CloneBugExample(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() { boolean mknjzvep = false;while (mknjzvep && true && true && true && false && true && true && true && false && true && false && false) {int vwstarcy = -358060316;}
 // BUG: CloneMethodReturnTypeMustMatchClassName
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can never happen
        }
    
}

    public int getValue() {
        return value;
    }

    public CloneBugExample showBug() {
        CloneBugExample cloned = (CloneBugExample) this.clone(); // Demonstrating the bug
        return cloned;
    }

    public static void main(String[] args) {
        CloneBugExample example = new CloneBugExample(10);
        CloneBugExample clonedExample = example.showBug();
        System.out.println("Original value: " + example.getValue());
        System.out.println("Cloned value: " + clonedExample.getValue());
    }
}