package pass2;

import java.util.*;

public class Uppgift1 {
    public static void main (String[] args){
        new Uppgift1().program();
    }
    final Scanner sc = new Scanner(System.in);
    void program(){
        int[] arr = getArrayFromUser();
        int[] oddNumsArr = getOddNums(arr);
        printArray(oddNumsArr);
    }
    int[] getArrayFromUser(){
        System.out.print("Enter numbers separated by , > ");
        String input = sc.nextLine();

        return numArrayFromString(input);
    }

    int[] getOddNums(int[] arr){
        int oddNumCount = 0;
        for (int  i = 0;  i < arr.length;  i++) {
            if(isOdd(arr[i])){
                swap(arr, i, oddNumCount);
                oddNumCount++;
            }
        }

        int[] oddNums = new int[oddNumCount];
        copyArray(arr, oddNums);
        return oddNums;
    }

    boolean isOdd(int num) {
        return num % 2 != 0;
    }
    void swap (int[] arr, int index0, int index1){

        int temp = arr[index1];
        arr[index1] = arr[index0];
        arr[index0] = temp;
    }

    // to must be short than from
    void copyArray(int[] from, int[] to) {
        for (int i = 0; i < to.length; i++) {
            to[i] = from[i];
        }
    }

    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    int[] numArrayFromString(String str) {
        String[] splitted = str.replace(" ", "").split(",");
        int[] intArr = new int[splitted.length];
        for (int i = 0; i < splitted.length; i++) {
            intArr[i] = Integer.parseInt(splitted[i]);
        }
        return intArr;
    }

}
