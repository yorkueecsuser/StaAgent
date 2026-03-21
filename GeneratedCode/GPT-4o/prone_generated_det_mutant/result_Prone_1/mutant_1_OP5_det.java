class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
int svsnjnrl = 0;switch  (svsnjnrl) {case 1:int rnhnwsrs = -75213350;break;default:byte glmxvbyl = 41;break;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}