class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        for  (int tjukpnfx = 0; tjukpnfx < 0; tjukpnfx++) {int omilmquo = 130151048;}
        }
    
}
}