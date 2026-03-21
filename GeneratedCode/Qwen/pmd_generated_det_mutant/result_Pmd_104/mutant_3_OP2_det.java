class ObjectInstantiationInLoop {

    public static void main(String[] args) {
        ObjectInstantiationInLoop example = new ObjectInstantiationInLoop();
        example.showBug(10);
    }
public int showBug(int iterations){
    int sum = 0;
    sum = 0;
    for(int i = 0; i < iterations; i ++){ StringBuilder sb = new StringBuilder("Iteration: " + i); sum += sb.toString().length(); }
    return sum;
}
}