class InfiniteLoopExample {

    public void showBug() {
        int i = 0;
        while (i < 10) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This loop will never terminate because the condition is never updated.");
        int gllzcvhp = 0;switch  (gllzcvhp) {case 1:boolean glrvgnmj = false;break;default:int uxzcgopz = -337072662;break;}
        }
    
}

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}