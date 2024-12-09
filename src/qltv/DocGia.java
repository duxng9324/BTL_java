package qltv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DocGia {
    private String maDocGia;
    private String ten;
    private int tuoi;
    private String diaChi;

    public DocGia(String maDocGia, String ten, int tuoi, String diaChi) {
        this.maDocGia = maDocGia;
        this.ten = ten;
        this.tuoi = tuoi;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "DocGia{" +
                "Mã Độc Giả='" + maDocGia + '\'' +
                ", Tên='" + ten + '\'' +
                ", Tuổi=" + tuoi +
                ", Địa Chỉ='" + diaChi + '\'' +
                '}';
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
                    int tuoi = Integer.parseInt(data[2]);
                    String diaChi = data[3];

                    DocGia docGia = new DocGia(maDocGia, ten, tuoi, diaChi);
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
