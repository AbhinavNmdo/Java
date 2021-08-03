package com.company;

import javax.lang.model.element.Element;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class W3Ex_Arrays {
//    5.
    /*
    public static boolean contains (int [] arr, int item) {
        for (int n : arr){
            if (n == item){
                return true;
            }
        }
        return false;
    }

     */

//    6.
    public static int indexofarr (int []arr, int item){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == item){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.
        /*
        int [] num = {1,5,8,6,4,7,8,9,5,6,656};
        String [] str = {"Abhay", "Palak", "Ashu", "Dhruv"};

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

         */


//        2.
        /*
        int [] num = {1,6,4,6,7,9};
        int sum = 0;

        for (int i=0; i<num.length; i++){
            int j = num[i];
            sum = sum + j;
        }
        System.out.println(sum);

         */


//        3.
        /*
        int [] a = {0};
        for (int j=0; j<10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(a[0] + " ");
            }
            System.out.println("");
        }

         */


//        4.
        /*
        int [] arr = {1, 2, 3 ,4, 5};
        float sum = 0;
        for (int i=0; i<arr.length; i++) {
            int l = arr[i];
            sum = sum + l;
        }
        System.out.println("The average value in the array is: "+ sum/(arr.length ));

         */


//        5.
        /*
        int[] arr = {2315, 5612, 4556, 7812, 5412, 2016, 2020, 2021};
        System.out.println(contains(arr, 2020));
        System.out.println(contains(arr,1212));

         */

//        6.
        /*
        int [] arr = {2315, 5612, 4556, 7812, 5412, 2016, 2020, 2021};
        System.out.println(indexofarr(arr, 2020));

         */


//        7.
        /*
        int [] arr = {2315, 5612, 4556, 7812, 5412, 2016, 2020, 2021};
        int removeindex = 3;
        for (int i=removeindex; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));

         */


//        8.
        /*
        int [] arr = {2315, 5612, 4556, 7812, 5412, 2016, 2020, 2021};
        int[] newarr = new int[8];
        for (int i=0; i<arr.length; i++) {
            newarr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));

         */


//        10.
        /*
        int [] arr = {2315, 5612, 4556, 7812, 5412, 2016, 2020, 2021};
        int max = 0;
        for (int e : arr) {
            if (e>max){
                max = e;
            }
        }
        System.out.println(max);

         */


//        11.
        /*
        int [] arr = {1, 3, 4, 6, 7, 3 ,1, 4, 6, 2};
        System.out.println(arr.length);
        System.out.println(arr.length-1);
        for (int i=0; i<arr.length/2; i++) {
            int r = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1-i] = r;
        }
        System.out.println(Arrays.toString(arr));

         */


//        12.







    }

}
