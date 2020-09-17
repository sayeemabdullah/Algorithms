import java.util.*;

public class BinarySearch{
  
  static boolean binarySearch(int[] arr , int n , int find){
    int low = 0;
    int high = n-1;
    while(low<=high){
      int mid = low + (high-1) /2;
      if(arr[mid]==find){
        return true;
      }
      else if(arr[mid]<find){
        low = mid + 1;
      }
      else if(arr[mid]>find){
        high = mid - 1;
      }
    }
    return false;
  }
  
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
    int f = input.nextInt(); // enter the number you want to find
    insertionSort(arr); 
    System.out.println(binarySearch(arr , n , f));
  }
}