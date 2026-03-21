class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        int lpjtafyn = 0;switch  (lpjtafyn) {case 1:byte vxvudsuk = 14;break;default:String dkcfuqmk = "zunknzqd";break;}
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        }
    
}
}