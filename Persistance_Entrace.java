/* 
   Take a string input from the user and return the duplicate input as the output 
   For eg. Input --> hello my name is hello
           Output --> hello
*/


import java.util.Scanner;

public class HW_10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];

        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }
        for(int i=0; i<size; i++){
            for(int j=i; j<size; j++){
                if(i != j && names[i].equals(names[j])){
                    System.out.println(names[i]);
                    //j=size+1;
                    System.out.println(j);
                }
            }
        }
        sc.close();
    }
}
