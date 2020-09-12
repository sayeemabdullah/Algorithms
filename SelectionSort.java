import java.util.*;

public class SelectionSort{
  
  static int[] selectionSort(int[] arr){
    for(int i=0;i<arr.length;i++){
      int minIndex = i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          minIndex = j;
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }
  
  static void print(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = input.nextInt();
    }
    selectionSort(arr);
    print(arr);
  }
}