class ThrowNullBug {
    public void showBug() {
        boolean uixhpwjx = false;while (uixhpwjx && false && false && false && true && false && false && false && true && false && false && false) {char niwjiqby = 'e';}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}