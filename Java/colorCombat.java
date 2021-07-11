import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String coordinates = inp.nextLine();
        int letter = coordinates.charAt(0);
        int number = coordinates.charAt(1);
        if((letter ^ number)%2 == 1){
            System.out.println("white");
        }else{
            System.out.println("black");
        }
    }
}