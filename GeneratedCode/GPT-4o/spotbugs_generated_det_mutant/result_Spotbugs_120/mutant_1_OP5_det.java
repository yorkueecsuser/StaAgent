class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        int klfsnsen = 0;switch  (klfsnsen) {case 1:boolean zvmnihgu = true;break;default:long veubahtj = -834427179;break;}
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        return y;
    
}

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}