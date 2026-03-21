class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            int iiqlhxxn = 0;switch  (iiqlhxxn) {case 1:float fmxlfkkz = 954726161;break;default:short kkbgbccr = -1703;break;}
            System.out.println("This is a bug!");
        }
    
}
}