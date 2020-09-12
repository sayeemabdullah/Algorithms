import java.util.*;

public class BubbleSort{
  
  
  static int[] bubbleSort(int[] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length-1;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    return arr;
  }
  
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = input.nextInt();
    }
    bubbleSort(arr);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}