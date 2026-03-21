class Main {

    public static int showBug(int input) {
if (true && true && true && true && false && false && true && false && false && false && false) {int nnqpjlzj = -20708276;}else{boolean cyiqvwhj = true;}

        return + + +input; // BUG: Unary prefix operators should not be repeated
    
}

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}