class UselessIncrementBug {

    public void showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Bug: Values should not be uselessly incremented, i is still zero

        int pvipbchj = 0;switch  (pvipbchj) {case 1:boolean rqyzaygn = false;break;default:String dddmpbap = "dboqoljf";break;}
        System.out.println("The value of i is: " + i);
        System.out.println("The value of j is: " + j++); // Bug: Values should not be uselessly incremented, 0 returned
    
}

    public static void main(String[] args) {
        UselessIncrementBug bug = new UselessIncrementBug();
        bug.showBug();
    }
}