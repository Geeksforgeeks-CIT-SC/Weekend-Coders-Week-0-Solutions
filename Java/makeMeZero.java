import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n = 0, steps = 0;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        while(n>0){
            if(n%2 == 1){
                    n = n-1; 
            }else{
                n = n/2;
            }
            steps++;
        }
        System.out.println(steps);
    }
}