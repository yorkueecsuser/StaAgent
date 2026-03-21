class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        if (false && false && false && true && false && false && false && false && false && false && false) {float uurjwbjz = -99008378;}else{byte orhjsmpr = 9;}
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