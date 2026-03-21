class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int dpqujowi = 0;switch  (dpqujowi) {case 1:long ezyzixuv = 513216859;break;default:byte cyrbnfeh = 119;break;}
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