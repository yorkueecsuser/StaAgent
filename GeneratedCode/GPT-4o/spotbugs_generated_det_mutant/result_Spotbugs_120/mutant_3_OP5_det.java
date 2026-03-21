class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        int fwjyzfsp = 0;switch  (fwjyzfsp) {case 1:long xrichgyw = -826922248;break;default:String xucpscnu = "vlrfwpne";break;}
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