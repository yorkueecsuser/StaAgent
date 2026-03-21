class ThrowNullBug {
    public void showBug() {
        int lffuvygw = 154228825;
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}