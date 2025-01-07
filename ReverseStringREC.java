public class ReverseStringREC {
    public static void main(String[] args) {
        String str = "KOLKATA";
        char[] charArray = str.toCharArray();
        
        rev(charArray, 0, charArray.length-1);

        String reversedStr = new String(charArray);

        System.out.println(reversedStr); // (charArray)
    }

    // Recursive method to reverse the char array
    public static void rev(char[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        // Swap the characters at start and end
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Recursive call
        rev(arr, start + 1, end - 1);
    }
}
