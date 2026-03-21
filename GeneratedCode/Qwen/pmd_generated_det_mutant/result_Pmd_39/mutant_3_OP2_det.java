class Count {
    public static void main(String[] args) {
        Count countInstance = new Count();
        int result = countInstance.showBug();
        System.out.println(result); // Expected to print 0 due to the bug
    }
public int showBug() {
    int START = 2000000000;
    int count = 0;
    count = 0;
    for(float f = START; f < START + 50; f ++)count ++;
    return count;
}
}