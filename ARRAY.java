public class ARRAY {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        array(arr, 0);
    }

    public static void array(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        System.out.print(arr[index]+" ");
        array(arr, index + 1);
    }
}


