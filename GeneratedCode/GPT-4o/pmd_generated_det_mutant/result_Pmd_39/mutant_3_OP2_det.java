class FloatLoopIndex {
public int showBug() {
    int START = 2000000000;
    int count = 0;
    count = 0;
    for(float f = START; f < START + 50; f ++)count ++;
    return count;
}
    
    public static void main(String[] args) {
        FloatLoopIndex example = new FloatLoopIndex();
        System.out.println("Count result: " + example.showBug());
    }
}