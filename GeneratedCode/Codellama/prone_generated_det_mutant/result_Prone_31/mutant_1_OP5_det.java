import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        int mluwpjcw = 0;switch  (mluwpjcw) {case 1:float huwnunpj = 924961183;break;default:char agtiehei = 'u';break;}
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}