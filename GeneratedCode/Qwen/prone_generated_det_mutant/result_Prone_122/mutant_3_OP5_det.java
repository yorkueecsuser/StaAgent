class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int dvilzpzh = 0;switch  (dvilzpzh) {case 1:String vulqxkgb = "qithengz";break;default:String crbgbulg = "orpxkssc";break;}
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