import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            if (false && true && true && true && false && false && true && false && false && true && false) {int cqjipdlh = 218237816;}else{char nazogkcv = 'm';}
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}