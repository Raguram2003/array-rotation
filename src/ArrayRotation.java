import java.util.Arrays;
import java.util.*;

class Solution{
    public String  arrRotation(int[] arr,int rotation){
        int m = arr.length;
        if (rotation > arr.length)
        {
            rotation = rotation % m;
        }
        int[] a = Arrays.copyOfRange(arr,  0,(m-rotation));
        int[] b = Arrays.copyOfRange(arr, (m-rotation), m);

        int length = a.length + b.length;
        int[] mergedArray = new int[length];
        int pos = 0;
        for (int element : b)
        {
            mergedArray[pos] = element;
            pos++;
        }
        for (int element : a)
        {
            mergedArray[pos] = element;
            pos++;
        }
        return (Arrays.toString(mergedArray));

    }
}
public class ArrayRotation
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int sizeOfArray = sc.nextInt();
        System.out.print("How many Rotation You Have to do : ");
        int rotation = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.print("Enter the Elements of the array : ");
        for(int i=0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }
        Solution result = new Solution();
        System.out.println(result.arrRotation(arr,rotation));
    }
}
