import java.util.*;

public class LinearSearch{
  
  static boolean linearSearch(int[] arr , int n , int find){
    for(int i=0;i<n;i++){
      if(arr[i]==find){
        return true;
      }
    }
    return false;
  }

  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = input.nextInt();
    }
    int f = input.nextInt(); // enter the number you want to find
    System.out.println(linearSearch(arr , n , f));
  }
}