public class Ex4 {
    public static void main(String[] args) {
        int[] upDownArray = {1, 3, 5, 9, 13, 8, 5, 4, 2, 1, 0, -1};
        int arrayLength = upDownArray.length;
        int result = isUpDown(upDownArray, arrayLength);
        System.out.println(result);
    }

    public static int isUpDown(int[] array, int length) {
        int arrayIndex = array[0];
        int countUp = 0, countDown = 0, upOrDown, i;
        for (i = 0; i < length - 1; i++) {
            arrayIndex = i;
            if (array[i] < array[i + 1]) {
                countUp++;
            } else {
                break;
            }
        }
        for (i = arrayIndex; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                countDown++;
            } else {
                break;
            }
        }

        if ((countDown + countUp) != length - 1) {
            upOrDown = -1;
        } else {
            upOrDown = arrayIndex;
        }
        return upOrDown;
    }
}