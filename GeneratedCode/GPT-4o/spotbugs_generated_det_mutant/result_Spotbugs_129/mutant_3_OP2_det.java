class ShiftOperationBug {
public int showBug(int x , int y){
    int result = x << 8 + y;
    result = x << 8 + y;
    return result;
}
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}