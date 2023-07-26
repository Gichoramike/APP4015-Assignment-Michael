public class stringChallenge {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";

        String[] subs = s.split(" ");
        for (String sub : subs) {
            char[] value = sub.toCharArray();
            reverseArray(value);
            String result = new String(value);
            System.out.println(result);
        }
    }

    public static void reverseArray(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
