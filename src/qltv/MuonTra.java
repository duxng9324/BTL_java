package qltv;

import java.io.*;
import java.util.ArrayList;

public class MuonTra {
    private String maDocGia;
    private String maSach;
    private String ngayMuon;
    private String ngayTra;
    private boolean daTra;

    public MuonTra() {
        this.maDocGia = "";
        this.maSach = "";
        this.ngayMuon = "";
        this.ngayTra = "";
        this.daTra = false;
    }

    public MuonTra(String maDocGia, String maSach, String ngayMuon, String ngayTra, boolean daTra){
        this.maDocGia = maDocGia;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.daTra = daTra;
    }

    // Getter và Setter
    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public boolean getDaTra() {
        return daTra;
    }

    public void setDaTra(boolean daTra) {
        this.daTra = daTra;
    }

    @Override
    public String toString() {
        return maDocGia + "," + maSach + "," + ngayMuon + "," + ngayTra + "," + daTra;
    }

    public static ArrayList<MuonTra> getMuonTra() {
        ArrayList<MuonTra> danhSachMuonTra = new ArrayList<>();
        String fileName = "CSDL/MuonTra.txt";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    String maDocGia = data[0];
                    String maSach = data[1];
                    String ngayMuon = data[2];
                    String ngayTra = data[3];
                    boolean daTra = Boolean.parseBoolean(data[4]);

                    MuonTra muonTra = new MuonTra(maDocGia, maSach, ngayMuon, ngayTra, daTra);
                    danhSachMuonTra.add(muonTra);
                }
            }
            System.out.println("Đã đọc thông tin mượn trả từ file thành công.");
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại: " + fileName);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }

        // In danh sách mượn trả để kiểm tra
        for (MuonTra mt : danhSachMuonTra) {
            System.out.println(mt);
        }

        return danhSachMuonTra;
    }
}
