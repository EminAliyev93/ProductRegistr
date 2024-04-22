/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import bean.Product;
import config.Base;
import java.util.Scanner;
import util.ImputUtil;
import util.ProductUtil;

/**
 *
 * @author Emin.Aliyev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------");
            int menu = ImputUtil.requiryNumber("Mehsul qeydiyyat sistemi. Ne etmek istediyini ededle daxil et"
                    + "\n1.Mehsul elave et"
                    + "\n2.Mehsullari goster"
                    + "\n3.Mehsulu axtar"
                    + "\n4.Mehsulu yenile"
                    + "\n5.Mehsulu sil"
                    + "\n6.Sistemden cix");
            if (menu == 1) {
                ProductUtil.fillProduct();

            } else if (menu == 2) {
                ProductUtil.showAlProduct();
            } else if (menu == 3) {
                ProductUtil.findProduct();
            } else if (menu == 4) {
                ProductUtil.updateProduct();
            }else if(menu==5){
               ProductUtil.deletProduct();
            }else{
                System.out.println("REGİSTRATİON WAS SUCCESSFUL");
                System.exit(0);
            }
        }

    }
}
