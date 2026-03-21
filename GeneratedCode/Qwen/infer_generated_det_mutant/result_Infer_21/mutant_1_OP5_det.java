import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            // i++;   <-- Commented out to create an infinite loop
        int omlszbez = 0;switch  (omlszbez) {case 1:boolean xspbxhlm = true;break;default:int rrvfygeg = -551134589;break;}
        }
        return i;
    
}

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}
