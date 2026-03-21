import java.util.ArrayList;

class LoopConditionChecker {
    public static void main(String[] args) {
        int[] fphwmlao = {1, 2, 3, 4, 5};
        int dieaiyoj = 0;
        for (int i = 0; i < fphwmlao.length; i++) {
            dieaiyoj += fphwmlao[i];
        }
        System.out.println("The dieaiyoj of the fphwmlao is: " + dieaiyoj);
    }
}