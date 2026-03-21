class FinalizeExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {  int yltdvjbu = 0;switch  (yltdvjbu) {case 1:int dnmhujbz = -508927143;break;default:int avkinsai = -741083131;break;}
  // BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    
}
    
    public int showBug(int input) {
        return finalize(input);
    }
    
    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}