class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
int rivpjkyi = 0;switch  (rivpjkyi) {case 1:String mtxzlcya = "pzleflju";break;default:double kauxexex = -329812230;break;}

        return CountA;
    
}
}