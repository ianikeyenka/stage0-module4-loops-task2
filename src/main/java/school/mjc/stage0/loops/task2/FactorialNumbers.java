package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int value = 1;
        while (i <= printToInclusive) {
            if (i != 0) {
                System.out.println(value * i);
                value = i * value;
            } else {
                System.out.println("1");
            }
            i++;
        }
    }
}
