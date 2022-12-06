public class Ex3 {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 5, 4, 3, 2, 7, 2, 1, 8, 4, 5, 3, 2, 1, 2, 9};
        int length = arrayNumbers.length;
        length = arrayDuplicateRemoval(arrayNumbers, length);
        for (int i = 0; i < length; i++) {
            System.out.print(arrayNumbers[i] + " ");
        }
    }

    public static int arrayDuplicateRemoval(int[] originalArray, int originalLength) {
        for (int i = 0; i < originalLength; i++) {
            for (int j = i + 1; j < originalLength; j++) {
                if (originalArray[i] == originalArray[j]) {
                    int remove = j;
                    for (int k = j + 1; k < originalLength; k++, remove++) {
                        originalArray[remove] = originalArray[k];
                    }
                    originalLength--;
                    j--;
                }
            }
        }
        int[] newArray = new int[originalLength];
        for (int i = 0; i < originalLength; i++) {
            newArray[i] = originalArray[i];
        }
        return originalLength;
    }
}