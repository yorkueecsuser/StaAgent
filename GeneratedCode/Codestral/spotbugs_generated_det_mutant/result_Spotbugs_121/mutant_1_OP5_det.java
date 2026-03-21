class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        int wdqvatmu = 0;switch  (wdqvatmu) {case 1:long dziyhoag = 671550007;break;default:char dhmbhbhk = 'c';break;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}