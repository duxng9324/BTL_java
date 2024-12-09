package qltv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fptshop
 */
public class Sach {
    private String maSach;
    private String ten;
    private String tacGia;
    private int soLuong;
    private boolean muon;
    
    public Sach() {
        this.ten = "";
        this.maSach = "";
        this.tacGia = "";
        this.soLuong = 0;
        this.muon = false;
    }

    public Sach(String maSach, String ten, String tacGia, int soLuong, boolean muon) {
        this.maSach = maSach;
        this.ten = ten;
        this.tacGia = tacGia;
        this.muon = muon;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public boolean getMuon() {
        return muon;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", ten=" + ten + ", tacGia=" + tacGia + ", soLuong=" + soLuong + ", muon=" + muon + '}';
    }

    public void setMuon(boolean muon) {
        this.muon = muon;
    }

    public static ArrayList<Sach> getSach() {
        ArrayList<Sach> danhSachSach = new ArrayList<Sach>();
        String fileName = "CSDL/Sach.txt";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
    while ((line = br.readLine()) != null) {
        String[] data = line.split(",");
        if (data.length == 5) {
            try {
                // Loại bỏ khoảng trắng thừa ở mỗi phần tử
                String maSach = data[0].trim();
                String ten = data[1].trim();
                String tacGia = data[2].trim();
                int soLuong = Integer.parseInt(data[3].trim());
                boolean muon = Boolean.parseBoolean(data[4].trim());

                Sach sach = new Sach(maSach, ten, tacGia, soLuong, muon);
                danhSachSach.add(sach);
            } catch (NumberFormatException e) {
                System.err.println("Dữ liệu không hợp lệ: " + line);
            }
        } else {
            System.err.println("Dòng không đúng định dạng: " + line);
        }
    }
    System.out.println("Đã đọc sách từ file thành công.");
} catch (IOException e) {
    System.err.println("Lỗi khi đọc file: " + e.getMessage());
}
        return danhSachSach;
    }
}
