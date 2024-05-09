public class SwapArrays {
    public static void main(String[] args) {
        int[] temperatures1 = { 25,26,27,28,29,30,31};
        int[] temperatures2 = { 7,45,44,39,48,37,53,46};

        // Print original arrays
        System.out.print("Original Temperatures1: ");
        for (int temp : temperatures1) {
            System.out.print(temp + " ");
        }
        System.out.println();

        System.out.print("Original Temperatures2: ");
        for (int temp : temperatures2) {
            System.out.print(temp + " ");
        }
        System.out.println();

        // Swap arrays
        int[] temp = temperatures1;
        temperatures1 = temperatures2;
        temperatures2 = temp;

        // Print swapped arrays
        System.out.print("Swapped Temperatures1: ");
        for (int tempss : temperatures1) {
            System.out.print(tempss + " ");
        }
        System.out.println();

        System.out.print("Swapped Temperatures2: ");
        for (int temps : temperatures2) {
            System.out.print(temps + " ");
        }
    }
}