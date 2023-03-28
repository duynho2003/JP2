/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pretest1;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Book implements Serializable {

    private String BookID;
    private String Title;
    private int Price;
    private String Publisher;

    public Book() {
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%d-%s", BookID, Title, Price, Publisher);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        String buf;

        String sIdPat = "B[\\d]{4}";
        Pattern idPat = Pattern.compile(sIdPat);
        while (true) {
            System.out.print("Nhap ma sach (Bxxxx): ");
            buf = sc.nextLine();
            Matcher mat = idPat.matcher(buf);
            if (mat.matches()) {
                setBookID(buf);
                break;
            } else {
                System.out.println("Ma sach khong hop le!");
            }
        }
        do {
            try {
                System.out.print("Nhap ten sach: ");
                Title = sc.nextLine();
                if (Title.isBlank()) {
                    throw new Exception("Ten sach khong duoc de trong.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (Title.isBlank());

        while (true) {
            System.out.print("Nhap gia tien (1-1000): ");
            Price = Integer.parseInt(sc.nextLine());
            if (Price >= 1 && Price <= 1000) {
                break;
            } else {
                System.out.println("Gia tien khong hop le!");
            }
        }
        while (true) {
            System.out.print("Nhap nha xuat ban (OUP hoac CUP): ");
            String publisher = sc.nextLine();
            if (publisher.equals("OUP") || publisher.equals("CUP")) {
                this.Publisher = publisher;
                break;
            } else {
                System.out.println("Nha xuat ban khong hop le!");
            }
        }
    }

    public String standardizedPublisher() {
        switch (this.Publisher) {
            case "OUP":
                return "Oxford University Press";
            case "CUP":
                return "Cambridge University Press";
            default:
                return this.Publisher;
        }
    }

    /**
     * @return the BookID
     */
    public String getBookID() {
        return BookID;
    }

    /**
     * @param BookID the BookID to set
     */
    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    /**
     * @return the Publisher
     */
    public String getPublisher() {
        return Publisher;
    }

    /**
     * @param Publisher the Publisher to set
     */
    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }
}
