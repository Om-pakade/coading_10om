public class Uniquenum {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9};
        int i, j;
        for (i = 0; i < arr.length; i++) {
            boolean Unique = true;
            for (j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    Unique = false;
                    break;
                }
            }
            if (Unique) {
                System.out.println(arr[i]);
            }
        }
    }
}
