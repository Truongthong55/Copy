package quanlyvattu;
import java.util.Scanner;
import java.util.ArrayList;
public class baocaotonkho {

    private double soLuongTon, maPhieuNhap;
    private String tenVatTu, maVatTu, ngayNhap;
   

public baocaotonkho(double soLuongTon,String maVatTu,double maPhieuNhap, String tenVatTu, String ngayNhap){
    this.soLuongTon = soLuongTon;
    this.maVatTu = maVatTu;
    this.maPhieuNhap = maPhieuNhap;
    this.tenVatTu = tenVatTu;
    this.ngayNhap = ngayNhap;
}
public double getSoLuongTon(){
    return soLuongTon;
}
public void setSoLuongTon(double soLuongTon){
    this.soLuongTon = soLuongTon;
}
public String getMaVatTu(){
    return maVatTu;
}
public void setMaVatTu(String maVatTu){
    this.maVatTu = maVatTu;
}
public double getMaPhieuNhap(){
    return maPhieuNhap;
}
public void setMaPhieuNhap(double maPhieuNhap){
    this.maPhieuNhap = maPhieuNhap;
}
public String getTenVatTu(){
    return tenVatTu;
}
public void setTenVatTu(String tenVatTu){
    this.tenVatTu = tenVatTu;
}
public String getNgayNhap(){
    return ngayNhap;
}
public void setNgayNhap(String ngayNhap){
    this.ngayNhap = ngayNhap;
}

public static ArrayList<baocaotonkho> nhapDSTonKho() {
    try (Scanner sc = new Scanner(System.in)) {
     ArrayList<baocaotonkho> list = new ArrayList<>();
     System.out.print("Nhap danh sach ton kho: ");

     System.out.println("So luong ton: ");
     double soLuongTon  = sc.nextDouble();
     System.out.println("Ten vat tu: ");
     String tenVatTu = sc.next();
     System.out.println("Ma vat tu: ");
     String maVatTu = sc.next();
     System.out.println("Ngay nhap: ");
     String ngayNhap = sc.next();
     System.out.println("Ma phieu nhap: ");
     double maPhieuNhap = sc.nextDouble();

        System.out.println("So luong ton: " + soLuongTon);
        System.out.println("Ten vat tu =  " + tenVatTu);
        System.out.println("Ma vat tu: " + maVatTu);
        System.out.println("Ngay Nhap: " + ngayNhap);
        System.out.println("Ma Phieu Nhap: " + maPhieuNhap);

        baocaotonkho tonkho = new baocaotonkho(soLuongTon, maVatTu, maPhieuNhap, tenVatTu, ngayNhap);
                list.add(tonkho);  
                return list;


    }
}
     // Phương thức hiển thị danh sách tồn kho
     public static void hienThiDSTonKho(ArrayList<baocaotonkho> list) {
        System.out.printf("%-20s%-15s%-10s%-15s%-15s%-20s%-20s\n", "Số lượng tồn", "Tên vật tư","Ngày nhập", "Mã phiếu nhập","Mã vật tư");
        for (baocaotonkho tonkho : list) {
            System.out.printf("%-20s%-15s%-10s%-15d%-15.2f%-20s%-20s\n",tonkho.getSoLuongTon(), tonkho.getMaVatTu(), tonkho.getNgayNhap(), tonkho.getMaPhieuNhap());
        }
    }
     // Phương thức xóa vật tư tồn kho

    public static void xoaVatTu(ArrayList<baocaotonkho> list, String maVatTu) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaVatTu().equals(maVatTu)) {
                list.remove(i);
                System.out.println("Đa xoa vat tu ton " + maVatTu);
                return;
            }
        }
        System.out.println("Khong tim thay vat tu ton kho" + maVatTu + " de xoa.");
    }
    // Phương thức sửa thông tin vật tư
    public static void suaVatTu(ArrayList<thongtinvattu> list, String maVatTu) {
        for (thongtinvattu vattu : list) {
            if (vattu.getMaVatTu().equals(maVatTu)) {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.print("Nhap ten vat tu moi: ");
                    String tenVatTu = sc.next();
                    vattu.setTenVatTu(tenVatTu);

                    System.out.print("Nhap ma vat tu moi: ");
                    String maVatTuMoi = sc.next();
                    vattu.setMaVatTu(maVatTuMoi);

                    System.out.print("Nhap mau moi: ");
                    String mau = sc.next();
                    vattu.setMau(mau);

                    System.out.print("Nhap so luong moi: ");
                    int soLuong = sc.nextInt();
                    vattu.setSoLuong(soLuong);

                    System.out.print("Nhap thanh tien moi: ");
                    double thanhTien = sc.nextDouble();
                    vattu.setThanhTien(thanhTien);
                    System.out.print("Nhap ma phieu xuat moi: ");
                    String maPhieuXuat = sc.next();
                    vattu.setMaPhieuXuat(maPhieuXuat);

                    System.out.print("Nhap ma phieu nhap moi: ");
                    String maPhieuNhap = sc.next();
                    vattu.setMaPhieuNhap(maPhieuNhap);
                }

                System.out.println("Đa sua thong tin vat tu co ma" + maVatTu);
                return;
            }   
        }
        System.out.println("Khong tim thay vat tu co ma " + maVatTu + " de sua.");
    }

}
