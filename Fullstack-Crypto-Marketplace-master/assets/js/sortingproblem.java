public class sortingproblem{
     public static void bubblesort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length - i - 1 ; i++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
     }
    public static void main(String[] args) {
        int arr[] = {0,5,0,3,42};
     bubblesort(arr);
     System.out.println("sorted arr  : ");
     for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
     }
    }
}