public class Main {
    public static void sub_array(int arr[],int start,int end){
        if(end==arr.length){
            //reached the end of the array
            return;
        }
        // Increment the end point and start from 0
        else if(start>end){
            sub_array(arr,0,end+1);
        }
        //print all elements between start and end pointer
        else {
            for(int i=start;i<end;i++){
                System.out.print(arr[i] + ", ");
            }

            System.out.println(arr[end]);
            sub_array(arr, start + 1, end);

            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        sub_array(arr,0,0);
    }
}
