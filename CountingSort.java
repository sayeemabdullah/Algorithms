import java.util.*;

public class CountingSort{
  
  static int[] countingSort(int[] arr , int n ,int highestValue){
    int countArr[] = new int[highestValue+1];
    int placeArr[] = new int[n+1];
    for(int i=0;i<n;i++){
      countArr[arr[i]]++;
    }
    for(int i=1;i<=highestValue;i++){
      countArr[i]=countArr[i]+countArr[i-1];
    }
    for(int i=0;i<n;i++){
      placeArr[countArr[arr[i]]]= arr[i];
      countArr[arr[i]]--;
    }
    return placeArr;
  }
  
  static void print(int[] arr){
    for(int i=1;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int highestValue = input.nextInt(); //Highest value/number the user will input in the array
    int n = input.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = input.nextInt();
    }
    print(countingSort(arr,n,highestValue));
  }
}