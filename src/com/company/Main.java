package com.company;
import ibadts.Stack;
import java.util.Scanner;
import ibadts.StaticStack;


public class Main {

    public static void main(String[] args) {
        int N = 3;
        StaticStack<String> stack = new StaticStack<>(N);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type words, max limit is 10 words: ");

        for(int i = 0; i < N; i++){
            String name = scanner.next();
            stack.push(name);
        }
        scanner.close();

        System.out.println();

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
