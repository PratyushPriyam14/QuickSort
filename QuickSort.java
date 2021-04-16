import java.io.*;
import java.util.*;
public class QuickSort
{
  public static void main(String []args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []arr=new int[n];
    for(int i=0; i<n ;i++)
    {
      arr[i]=s.nextInt();
    }
    quicksort(arr, 0 , arr.length-1);
    print(arr);
  }
   public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
   }
   // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void partition(int []arr, int low,int high, int pivot)
  { 
     System.out.println("pivot -> " + pivot);
    int i=low;
    int j=low;
    //region1-> i to end   (unknown)
    //region2-> j to i-1  (greater) i++
    //region3-> 0 to j-1  (smaller equal to) swap(i,j) i++ j++
    while(i<arr.length)
    {
      if(arr[i] <= pivot){  // smaller area or equal to
        swap(arr,i,j)
          i++;
          j++;
      }else{  //greater area
        i++;
       }
    }
    System.out.println("pivot index -> " + (j - 1));
    return (j - 1);
  }
    public static void quickSort(int[] arr, int low, int high) {
    //base case
      if(low >= high){
        return;
      }
      int pivot= arr[high];
      int pivotindex= partition(arr, pivot, low, high);
      quickSort (arr, low, pivotindex-1);
      quickSort (arr, pivotindex+1, high);   
  }
}
