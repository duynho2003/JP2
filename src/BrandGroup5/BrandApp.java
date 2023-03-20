package BrandGroup5;

import java.util.Scanner;

public class BrandApp {

    int max = 2;
    int next = 0;
    Scanner sc = new Scanner(System.in);
    BrandModel[] brmodel;

    public BrandApp() {
        sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter number of brand to management: ");
                max = Integer.parseInt(sc.nextLine());
                if (max <= 1 || max >= 100) {
                    throw new BrandException("Number must be in rank [2 - 99]");
                }
            } catch (BrandException e) {
                System.out.println(e.getMessage());
            }
        } while (max <= 1 || max >= 100);
        next = 0;
        brmodel = new BrandModel[max];
    }

    public void addNewBrand() throws BrandException {
        if (next >= max) {
            throw new BrandException("Cannot add more than " + max + " brand");
        }
        /*String model, type;
        int size; */
        //1. Khai bao Bycicles va cac attribute cua no
        //Bycicles bike; => sai
        String x = null, y = null;
        int z = 0;
        //---------------------//
        do {
            try {
                System.out.println("Enter Brand name: ");
                x = sc.nextLine();
                if (x.isEmpty()) {
                    throw new BrandException("Brand can not left blank!");
                }
            } catch (BrandException e) {
                System.out.println(e.getMessage());
            }
        } while (x.isEmpty());
        //-------------
        do {
            System.out.println("Enter Model type: ");
            y = sc.nextLine();
            if (y.isEmpty()) {
                System.err.println("Model type can not left blank!");
            }
        } while (y.isEmpty());
        //-------------
        System.out.println("Enter ID: ");
        z = Integer.parseInt(sc.nextLine());
        //---------------------//
        brmodel[next] = new BrandModel(x, y, z);
        next++;
    }

    public void displayBrand() {
        if (next == 0) {
            System.err.println("There is no brand to display!");
        } else {
            for (int i = 0; i < next; i++) {
                System.out.println(brmodel[i].output());
            }
        }
    }
}
