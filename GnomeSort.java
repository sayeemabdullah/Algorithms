import java.util.*;

public class GnomeSort{
  
  static int[] gnomeSort(int[] arr){
    int pos = 0;
    while(pos!=arr.length){
      if(pos == 0){
        pos++;
      }
      else if(arr[pos-1]>arr[pos]){
        int temp = arr[pos-1];
        arr[pos-1] = arr[pos];
        arr[pos] = temp;
        pos--;
      }
      else{
        pos++;
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
    gnomeSort(arr);
    print(arr);
  }
}