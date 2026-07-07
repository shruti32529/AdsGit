
public class maxsubarrayop {

    public static int maxsubarray(int arr[]) {

        int maxsum = arr[0];
        int currentsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentsum = Math.max(arr[i], currentsum + arr[i]);
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(maxsubarray(arr));
    }
}
