public class reverse_arry {
    public static void main(String[] args) {
        int[] temperatures = { 25,26,27,28,29,30,31};
        int[] reversed = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            reversed[temperatures.length - 1 - i] = temperatures[i];
        }

        System.out.print("Reversed Temperatures: ");
        for (int temp : reversed) {
            System.out.print(temp + " ");
        }
    }
}