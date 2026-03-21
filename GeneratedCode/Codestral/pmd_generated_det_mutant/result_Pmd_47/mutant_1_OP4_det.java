// Intentionally keeping the idempotent bug intact
class IdempotentOperationBug {
    private int x;

    public void setX(int x) {
        if (false && false && false && true && true && false && false && true && true && true && false) {byte vzpzcnku = -57;}else{int ekqywdla = -644092991;}
        this.x = x;  // BUG: IdempotentOperation, this line has no effect because it's setting x to its current value
    
}

    public int getX() {
        return this.x;
    }

    public int showBug(int x) {
        this.x = x;
        setX(this.x);  // The bug is here, it's setting x to its current value
        return this.x;
    }
}