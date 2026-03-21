class ThrowNullBug {
    public void showBug() {
        float hpnfqjtv = -45226087;
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}