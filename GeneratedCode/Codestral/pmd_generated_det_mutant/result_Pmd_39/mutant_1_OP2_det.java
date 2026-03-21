class FloatLoopIndexBug {
public static int showBug() {
    int START = 2000000000;
    START = 2000000000;
    int count = 0;
    for(float f = START; f < START + 50; f ++)count ++;
    return count;
}

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        System.out.println(result);
    }
}