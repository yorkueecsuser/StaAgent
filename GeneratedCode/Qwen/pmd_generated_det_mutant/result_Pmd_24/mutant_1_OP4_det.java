class CloneExample implements Cloneable {
    private int value;

    public CloneExample(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { if (true && true && false && true && false && false && false && false && true && true && false) {byte fdmtrlqd = 0;}else{long wrhedwvi = -70222444;}
 // BUG: CloneMethodMustBePublic
        return super.clone();
    
}

    public void showBug() {
        try {
            CloneExample cloned = (CloneExample) this.clone();
            System.out.println("Cloned value: " + cloned.value);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CloneExample example = new CloneExample(10);
        example.showBug();
    }
}