import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            if (true && true && true && false && true && true && true && true && true && false && false) {float ffuoqhwn = 943836313;}else{String qsmvmfsh = "wttjbmia";}
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