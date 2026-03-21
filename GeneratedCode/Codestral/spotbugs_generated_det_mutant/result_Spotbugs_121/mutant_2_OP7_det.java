class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        boolean fdxhctii = false;while (fdxhctii && true && false && true && true && true && false && false && false && true && true && false) {char rtmjaxrb = 'a';}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}