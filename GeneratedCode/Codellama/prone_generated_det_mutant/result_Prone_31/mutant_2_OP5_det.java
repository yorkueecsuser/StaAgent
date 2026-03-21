import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        int qopsanmw = 0;switch  (qopsanmw) {case 1:char bldkiadz = 'z';break;default:float wsnsesja = 510454570;break;}
        try {
            // BUG: DeadException
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}