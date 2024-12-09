package qltv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DocGia {
    private String maDocGia;
    private String ten;
    private String sdt;
    private String diaChi;
    
    public DocGia(){
        this.maDocGia = "";
        this.ten = "";
        this.sdt = "";
        this.diaChi = "";
    }
    public DocGia(String maDocGia, String ten, String sdt, String diaChi) {
        this.maDocGia = maDocGia;
        this.ten = ten;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSDT() {
        return sdt;
    }

    public void setSDT(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return maDocGia + "," + ten + "," + sdt + "," + diaChi;
    }
    
    public static ArrayList<DocGia> getDocGia (){
        ArrayList<DocGia> danhSachDocGia = new ArrayList<DocGia>();
        String fileName = "CSDL//DocGia.txt";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String maDocGia = data[0];
                    String ten = data[1];
                    String sdt = data[2];
                    String diaChi = data[3];

                    DocGia docGia = new DocGia(maDocGia, ten, sdt, diaChi);
                    danhSachDocGia.add(docGia);
                }
            }
            System.out.println("Đã đọc độc giả từ file thành công.");
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return danhSachDocGia;
    }
}
