package numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int sumOfDividers = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0){
                sumOfDividers+=i;
            }
        }
        return (number == sumOfDividers);
    }
}
