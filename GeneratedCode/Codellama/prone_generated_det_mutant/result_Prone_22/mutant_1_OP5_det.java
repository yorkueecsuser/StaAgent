class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            int asqrxmmk = 0;switch  (asqrxmmk) {case 1:boolean nqnkrxeo = false;break;default:int hoyklocw = 929605525;break;}
            System.out.println("This is a bug!");
        }
    
}
}