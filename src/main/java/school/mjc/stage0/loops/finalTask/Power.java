package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int sum = numberToPrint;
        if (power == 1) {
            System.out.println(numberToPrint);
            return;
        }
        for (int i = 1;i < power; i++) {
            sum *= 10;
        }
        sum = (power % 2 == 0) ? Math.abs(sum) : sum;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
