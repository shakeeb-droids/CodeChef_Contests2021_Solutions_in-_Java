import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int sum1=0;
        int sum2=0;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
            a[i][j]=sc.nextInt();
            }
        }
         for(int i =0;i<n;i++)
        {
            sum1+= +a[i][i];
        }
        int k=0;
            for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
            {
                if(i==n-j-1){
                    sum2=sum2+a[i][j];
                }
            }
            }
             int diff = sum1-sum2;
             System.out.println(+ Math.abs(diff));
    }
}

