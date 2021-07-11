import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if((n&(n-1))==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}