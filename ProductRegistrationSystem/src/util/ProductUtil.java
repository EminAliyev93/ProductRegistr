/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Product;
import config.Base;

/**
 *
 * @author Emin.Aliyev
 */
public class ProductUtil {

    public static void fillProduct() {
        int say = ImputUtil.requiryNumber("Neche mehsul elave etmek isteyirsen?");
        Base.product = new Product[say];
        for (int i = 0; i < Base.product.length; i++) {
            System.out.println((i + 1) + "-ci Mehsul");
            int barcod = ImputUtil.requiryNumber("Barcod daxil et");
            String name = ImputUtil.requiryText("Mehsul adi daxil et");
            int quantity = ImputUtil.requiryNumber("Say daxil et");
            double price = ImputUtil.requiryPrice("Qimet daxil et");
            Base.product[i] = new Product(barcod, name, quantity, price);
        }
    }

//    public static void showAlProduct1() {
//        System.out.println("Bazada olan mehsullar");
//        if (Base.product == null) {
//            return;
//        }
//        for (Product p : Base.product) {
//            System.out.println(p.getBarcode() + " " + p.getName() + " " + p.getQuantity() + " " + p.getPrice());
//        }
//    }
    public static void showAlProduct() {
        System.out.println("Bazada olan mehsullar");
        if (Base.product == null) {
            return;
        }
        
        for (int i = 0; i < Base.product.length; i++) {
            if(Base.product[i]!=null){
            System.out.println((i + 1) + "." + Base.product[i]);

        }}

    }

    public static void findProduct() {
        String text = ImputUtil.requiryText(" name");
        for (int i = 0; i < Base.product.length; i++) {
            Product p = Base.product[i];
            if (p.getName().contains(text)) {
                System.out.println(p);
            }
        }
    }

    public static void updateProduct() {
        ProductUtil.showAlProduct();
        int number = ImputUtil.requiryNumber("Necenci mehsulun patametrini deyismek isteyirsen?") - 1;
        Product p = Base.product[number];
        String parametr = ImputUtil.requiryText("Hansi melumati deyismek isteyirsiniz?\n  barcod || name || quantity || price");
        if (parametr.contains("barcode")) {
            p.setBarcode(ImputUtil.requiryNumber("Yeni barcod daxil edin"));
        }
        if (parametr.contains("name")) {
            p.setName(ImputUtil.requiryText("Yeni ad daxil edin"));
        }
        if (parametr.contains("quantity")) {
            p.setQuantity(ImputUtil.requiryNumber("Yeni say daxil edin"));
        }
        if (parametr.contains("price")) {
            p.setPrice(ImputUtil.requiryPrice("Yeni qiymet daxil edin"));
        }
    }
    public static void deletProduct(){
         ProductUtil.showAlProduct();
                int number=ImputUtil.requiryNumber("Necenci mehsulu silmek isteyirsen?");
                Base.product[number-1]=null;
    }
}
