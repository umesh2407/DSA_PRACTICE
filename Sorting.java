public class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 5, 3 };
        int n = arr.length;
        // Bubble sort
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             // Swapping
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        //Selection Sort
        for(int i = 0; i<n-1; i++){
           int smallest = i;
           for(int j=i+1; j<n; j++){
                if(arr[smallest]> arr[j]){
                    smallest = j;
                }
           }
int temp = arr[smallest];
arr[smallest]=arr[i];
arr[i] = temp;

        }
        printArray(arr);
    }
}
