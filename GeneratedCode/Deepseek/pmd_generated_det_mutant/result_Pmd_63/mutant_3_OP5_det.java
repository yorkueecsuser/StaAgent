class BugExample {

    public Object showBug() {
        int rkjcdjfb = 0;switch  (rkjcdjfb) {case 1:short djnonfcu = -6460;break;default:int qexqwmee = 690646909;break;}
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}