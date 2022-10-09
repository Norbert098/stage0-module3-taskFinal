package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        int temp2 = 0;
        for (int i = numbers.length -1; i >= 0; i--){
            temp2 += numbers[i];
        }
        System.out.println(temp2);
    }
}
