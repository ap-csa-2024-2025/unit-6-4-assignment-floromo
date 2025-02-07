import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Problem 1
    System.out.println("Enter array length: ");
    int len = sc.nextInt();
    System.out.println("Enter target length: ");
    int target = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter values: ");
    String[] arr1 = new String[len];
    for (int i = 0; i < len; i++){
      arr1[i] = sc.nextLine();
    }
    System.out.println("Number of elements at target length: " + countLength(arr1, target));


    // Problem 2
    System.out.println("Enter array length: ");
    len = sc.nextInt();
    System.out.println("Enter target: ");
    double doubletarget = sc.nextDouble();

    System.out.println("Enter values: ");
    double[] arr2 = new double[len];
    for (int i = 0; i < len; i++){
      arr2[i] = sc.nextDouble();
    }
    System.out.println("Index of target: " + indexOf(arr2, doubletarget));


    // Problem 3
    System.out.println("Enter array length: ");
    len = sc.nextInt();

    System.out.println("Enter values: ");
    int[] arr3 = new int[len];
    for (int i = 0; i < len; i++){
      arr3[i] = sc.nextInt();
    }
    System.out.println("Has duplicate: " + hasDuplicates(arr3));


    // Problem 4
    System.out.println("Enter array length: ");
    len = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter values: ");
    String[] arr4 = new String[len];
    for (int i = 0; i < len; i++){
      arr4[i] = sc.nextLine();
    }
    System.out.println("Mode is: " + findMode(arr4));
  }

  // Problem 1
  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++){
      if ((arr[i]).length() == targetLength){
        count++;
      }
    }
    return count;
  }

  // Problem 2
  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++){
      if (arr[i] == target){
        return i;
      }
    }
    return -1;
  }

  // Problem 3
  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++){
      for (int j = i+1; j < arr.length; j++){
        if (arr[j] == arr[i]){
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    String currentMode = arr[0];
    int prevCount = 0;
    for (int i = 0; i < arr.length; i++){
      int currCount = 0;
      for (int j = 0; j < arr.length; j++){
        if (arr[j].equals(arr[i])){
          currCount++;
        }
      }
      if (currCount > prevCount){
        prevCount = currCount;
        currentMode = arr[i];
      }
    }
    return currentMode;
  }
}
