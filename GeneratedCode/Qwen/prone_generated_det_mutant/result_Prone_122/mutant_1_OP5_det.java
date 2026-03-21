class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int dwzimulz = 0;switch  (dwzimulz) {case 1:String qmwpczxh = "dtdbhsjv";break;default:boolean qdjktpsd = true;break;}
        int x = flag? foo : null; // BUG: NullTernary
        return x;
    
}

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println(example.showBug(false, 10));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}