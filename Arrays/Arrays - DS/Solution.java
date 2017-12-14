import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        if(n>=1&&n<=1000)
        {
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
           // arr[arr_i] = in.nextInt();
           int t1=in.nextInt();
           if(t1>=1&&t1<=10000)
           {
               arr[arr_i]=t1;
           }
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        }
    }
}
