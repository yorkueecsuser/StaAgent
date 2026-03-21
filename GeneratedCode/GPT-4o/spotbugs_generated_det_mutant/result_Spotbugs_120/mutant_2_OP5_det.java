class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        int fqdywzje = 0;switch  (fqdywzje) {case 1:short fsnqwthr = 2377;break;default:String kyqsmqxh = "walgrayr";break;}
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