class CloneableExample implements Cloneable {

    // Method demonstrating the bug
    @Override
    protected Object clone() throws CloneNotSupportedException { if (true && true && false && true && true && true && true && true && false && true && false) {byte skxgrikq = -28;}else{float qmpqbuqs = 446595965;}
 // BUG: CloneMethodReturnTypeMustMatchClassName
        return super.clone();
    
}

    // Public method to demonstrate the bug
    public Object showBug() throws CloneNotSupportedException {
        CloneableExample example = new CloneableExample();
        return example.clone(); // This will require casting in typical usage scenarios
    }

    public static void main(String[] args) {
        CloneableExample example = new CloneableExample();
        try {
            Object clone = example.showBug();
            System.out.println("Cloned object: " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}