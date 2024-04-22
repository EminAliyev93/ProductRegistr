/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Emin.Aliyev
 */
public class ImputUtil {

    public static String requiryText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        String answer = sc.nextLine();
        return answer;
    }

    public static int requiryNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        int answer = sc.nextInt();
        return answer;
    }

    public static double requiryPrice(String price) {
        Scanner sc = new Scanner(System.in);
        System.out.println(price + ":");
        double answer = sc.nextDouble();
        return answer;
    }

    
}
