package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));
    }
    public static int recursiveFactorial(int num){
        if (num == 0){
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }

    public static int iterativeFactorial(int num){

        if (num == 0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1;i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
