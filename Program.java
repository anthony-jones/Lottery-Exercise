
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (Integer number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
// OUTPUT:
//    Lottery numbers:
//        18 39 35 10 23 3 13 