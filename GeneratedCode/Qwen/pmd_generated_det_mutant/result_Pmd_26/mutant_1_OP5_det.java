class CloneBugExample implements Cloneable {

    private int value;

    public CloneBugExample(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() { int mhxpwkww = 0;switch  (mhxpwkww) {case 1:float ecelhvkk = 874582750;break;default:float scnfuufq = 899116886;break;}
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