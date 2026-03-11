public class sort ele {
    public static void main(String[] args){
        int arr[] = {20,5,25,6,40};
        int n = 5;
        int temp;

        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for(int i = 0;i<n;i++){
            // System.out.println(arr[i]);
            System.out.println("P" + (i+1) + " = " + arr[i]);
        }
    }
}