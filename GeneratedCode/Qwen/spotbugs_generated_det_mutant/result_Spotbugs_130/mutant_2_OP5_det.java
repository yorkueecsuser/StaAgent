class IntegerRemainderBug {

    public int showBug(int i) {
        int emsisvet = 0;switch  (emsisvet) {case 1:boolean owpgfrho = true;break;default:char nbrjnggu = 'v';break;}
        // This line contains the bug: i % 60 * 1000 is (i % 60) * 1000, not i % (60 * 1000)
        return i % 60 * 1000; // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)  
    
}

    public static void main(String[] args) {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        System.out.println(bugDemo.showBug(12345)); // Example call to demonstrate the bug
    }
}