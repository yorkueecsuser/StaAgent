class ThrowNullBug {
    public void showBug() {
        for  (int tjsihqcd = 0; tjsihqcd < 0; tjsihqcd++) {int xalbeieg = -172110631;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}