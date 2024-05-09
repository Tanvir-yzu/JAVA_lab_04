public class mergeArrays {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] temperatures1 = { 25,26,27,28,29,30,31};
        int[] temperatures2 = { 7,45,44,39,48,37,53,46};

        int[] mergedTemperatures = mergeArrays(temperatures1, temperatures2);

        System.out.print("Merged Temperatures: ");
        for (int temp : mergedTemperatures) {
            System.out.print(temp + " ");
        }
    }
}