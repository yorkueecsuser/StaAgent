class CloneIdiom1 implements Cloneable {
    private int id;

    public void setId(int id) {
        this.id = id;  // Original assignment statement
        this.id = id;  // Duplicated assignment statement
    }
}