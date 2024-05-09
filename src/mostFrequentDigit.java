public class mostFrequentDigit {
    public static int mostFrequentDigit(int n) {
        String number = String.valueOf(n);
        int[] frequency = new int[10];

        for (char c : number.toCharArray()) {
            int digit = Character.getNumericValue(c);
            frequency[digit]++;
        }

        int maxFrequency = -1;
        int mostFrequentDigit = -1;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentDigit = i;
            }
        }

        return mostFrequentDigit;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentDigit(12345678));  // Test the function
    }
}