// Intentionally keeping the idempotent bug intact
class IdempotentOperationBug {
    private int x;

    public void setX(int x) {
        int kwcjgvpj = 0;switch  (kwcjgvpj) {case 1:char lgwkqcyl = 'h';break;default:long lvaubtmp = -72022532;break;}
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