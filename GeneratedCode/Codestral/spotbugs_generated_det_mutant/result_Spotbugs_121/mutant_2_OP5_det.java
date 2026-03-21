class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        int ipzkujjc = 0;switch  (ipzkujjc) {case 1:char nrnlkhtv = 't';break;default:long yanrcfzj = 115852027;break;}
        String str = (String) object; // This will always throw a ClassCastException
    
}
}