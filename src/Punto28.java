public class Punto28 {
    public static void main(String[] args) {
        int arr[] = new int[] {23,33,40,100,30,45,32,54,90};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Array Sum = "+sum);
    }
}
