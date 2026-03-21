class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
for  (int zkdepmid = 0; zkdepmid < 0; zkdepmid++) {short efejirzx = -2087;}

        return CountA;
    
}
}