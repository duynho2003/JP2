/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.aptech;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Inventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDao dao = new ProductDao();
        int choose = 0;
        while (choose != 6) {
            System.out.println("1.Add new Product");
            System.out.println("2.Display Product List");
            System.out.println("3.Find by Name");
            System.out.println("4.Update product");
            System.out.println("5.Delete product by id");
            System.out.println("6.Exit");
            System.out.println("Choose: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Product p = new Product();
                    p.input();
                    if (dao.create(p)) {
                        System.out.println("Add new Product successfully.");
                    } else {
                        System.out.println("Failed to create new Product.");
                    }
                    break;

                case 2:
                    List<Product> result = dao.findAll();
                    System.out.println("List of all product:");
                    result.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Input name: ");
                    String name = sc.nextLine();
                    List<Product> result1 = dao.findByName(name);
                    System.out.println("List of all product:");
                    result1.forEach(System.out::println);
                    break;

                case 4:
                    Product p2 = new Product();
                    p2.input();

                    if (dao.update(p2)) {
                        System.out.println("Update Product successfully.");
                    } else {
                        System.out.println("Failed to update Product.");
                    }
                    break;

                case 5:
                    System.out.println("Input id: ");
                    int id = Integer.parseInt(sc.nextLine());

                    if (dao.delete(id)) {
                        System.out.println("Deleted Product.");
                    } else {
                        System.out.println("Cannot delete Product.");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
