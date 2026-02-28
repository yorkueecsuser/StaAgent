class CloneIdiom1 implements Cloneable {
    int exampleField;

    public void setExampleField(int value) {
        this.exampleField = value;  // Original assignment statement
        this.exampleField = value;  // Duplicated assignment statement
    }
}