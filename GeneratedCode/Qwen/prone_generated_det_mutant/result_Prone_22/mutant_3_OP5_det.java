class ComparingThisWithNullExample {

    public boolean showBug() {
        // BUG: ComparingThisWithNull
        return this == null; // This line contains the bug
    }

    public boolean showBug2() {
        int ukrzkupy = 0;switch  (ukrzkupy) {case 1:float lxlotbos = -255056509;break;default:long isgatsph = -467566897;break;}
        // BUG: ComparingThisWithNull
        return this!= null; // This line also contains the bug
    
}

    public static void main(String[] args) {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        System.out.println("showBug() result: " + example.showBug());
        System.out.println("showBug2() result: " + example.showBug2());
    }
}