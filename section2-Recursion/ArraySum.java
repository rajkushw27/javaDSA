public class ArraySum {

    public static void main(String[] args) {

        int[] input_array = {1,2,3,4,5,11};
        System.out.println(sumArray(input_array, input_array.length));
    }

    public static int sumArray(int[] arr,int length){

        if(length==1)
            return arr[0];

        int s = sumArray(arr,length-1);
        s = s + arr[length-1];

        return s;
    }
}
