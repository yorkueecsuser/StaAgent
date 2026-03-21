import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {
@ Expensive public int showBug(int x){
    int i = 0;
    i = 0;
    while(i * i < x){ }
    return i;
}

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}
