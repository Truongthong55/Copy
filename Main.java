package quanlyvattu;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {
                                    
        ArrayList<thongtinvattu> list = new ArrayList<thongtinvattu>();        
            System.out.println("===== Quan ly vat tu =====");
            System.out.println("1. Nhap danh sach vat tu");
            System.out.println("2. Hien thi danh sach vat tu");
            System.out.println("3. Xoa vat tu");
            System.out.println("4. Sua thong tin vat tu");
            System.out.println("5. Them vat tu");
            System.out.println("6. Sua so luong vat tu");
            System.out.println("7. Sap xep tang dan theo ma vat tu");
            System.out.println("8. Sap xep giam dan theo ma vat tu");
            System.out.println("9. Tim kiem vat tu theo ma");
            System.out.println("10. Nhap danh sach ton kho");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");       
    int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    thongtinvattu.nhapDSVatTu();
                    break;
                case 2:
                    thongtinvattu.hienThiDSVatTu(list);
                    break;
                case 3:
                    System.out.print("Nhap ma vat tu can xoa: ");
                    String maVatTuXoa = sc.next();
                    thongtinvattu.xoaVatTu(list, maVatTuXoa);
                    break;
                case 4:
                    System.out.print("Nhap ma vat tu can xoa: ");
                    String maVatTuSua = sc.next();
                    thongtinvattu.suaVatTu(list, maVatTuSua);
                    break;
                case 5:
                    thongtinvattu.themVatTu(list);
                     break;
                case 6:
                    System.out.print("Nhap ma vat tu can sua so luong: ");
                    String maVatTuSuaSL = sc.next();
                    thongtinvattu.suaSoLuongVatTu(list, maVatTuSuaSL, choice);
                    break;
                case 7:
                    thongtinvattu.sapXepTang(list);
                    break;
                case 8:
                    thongtinvattu.sapXepGiam(list);
                    break;
                case 9:
                    System.out.print("Nhap ma vat tu can tim kiem: ");
                    String maVatTuTimKiem = sc.next();
                    thongtinvattu.timKiem(list, maVatTuTimKiem);
                    break;
                case 10:
                    baocaotonkho.nhapDSTonKho();
                    break;

                case 0:
                    System.out.println("Chuong trinh ket thuc.");
                    System.exit(0);
                    break; 
                default:
                    System.out.println("Chuc nang khong hop le. Vui long chon lai.");
                    break;
            }            
              
        }

}


