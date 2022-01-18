package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int num = Integer.valueOf(scan.nextLine());
        int[] inp = new int[num];
        int f = 0;
        int count = 0;
        for (int i = 0; i < num; i++) {
            f = scan.nextInt();
            if (f != 0) {
                inp[count] = f;
                count+=1;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(inp[i] + " ");
        }
    }
}
