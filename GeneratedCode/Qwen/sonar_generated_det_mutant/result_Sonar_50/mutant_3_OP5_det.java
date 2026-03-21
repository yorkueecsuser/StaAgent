class AssertJBugExample {

    public Object showBug() {
        int frptcxou = 0;switch  (frptcxou) {case 1:boolean egypjurn = false;break;default:short vrdnkjpz = 5101;break;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}