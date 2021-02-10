
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random random = new Random();
        while (this.numbers.size() < 7) {
            int numberDrawn = random.nextInt(40) + 1;
            if (!this.containsNumber(numberDrawn)) {
                this.numbers.add(numberDrawn);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}

