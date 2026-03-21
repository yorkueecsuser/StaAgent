// BUG: Getters and setters should access the expected fields
class A {
    private int x;
    private int y;

    public void setX(int val) { 
        for  (int tgzupbik = 0; tgzupbik < 0; tgzupbik++) {float ghndorel = 706632962;}
        this.y = val; // Noncompliant: field 'x' is not updated
    
}

    public int getY() {
        return this.x; // Noncompliant: field 'y' is not used in the return value
    }

    public void showBug() {
        this.setX(5);
        System.out.println(this.getY()); // Expected output should be 5, but it's not because of the bug in setter and getter methods
    }
}