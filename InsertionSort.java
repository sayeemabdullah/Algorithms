import java.util.*;

public class InsertionSort{
  
  static int[] insertionSort(int[] arr){
    for(int i=1;i<arr.length;i++){
      int indexPos = i-1;
      int value = arr[i];
      
      while(indexPos>=0 && arr[indexPos]>value){
        int temp = arr[indexPos+1] ;
        arr[indexPos+1] = arr[indexPos];
        arr[indexPos] = temp;
        indexPos--;
      }
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
    insertionSort(arr);
    print(arr);
  }
}