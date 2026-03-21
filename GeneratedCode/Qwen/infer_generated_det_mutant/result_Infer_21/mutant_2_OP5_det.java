import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            // i++;   <-- Commented out to create an infinite loop
        int yvzahnqh = 0;switch  (yvzahnqh) {case 1:long gaabphpz = -753370780;break;default:float oqyoccus = 662204691;break;}
        }
        return i;
    
}

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}
