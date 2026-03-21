class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
int hgjvhyto = 0;switch  (hgjvhyto) {case 1:int uityygzo = -10643574;break;default:boolean luwnuesk = false;break;}

        return CountA;
    
}
}