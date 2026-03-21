// BUG: Getters and setters should access the expected fields
class A {
    private int x;
    private int y;

    public void setX(int val) { 
        int hydwzggj = 0;switch  (hydwzggj) {case 1:long xckmgkgt = 990482817;break;default:float ypbcdpzi = -330823173;break;}
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