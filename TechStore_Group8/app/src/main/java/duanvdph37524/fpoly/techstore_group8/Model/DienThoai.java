package duanvdph37524.fpoly.techstore_group8.Model;

public class DienThoai {
    int maDT;
    String tenDienThoai, hinhAnh;
    int giaTien;

    public DienThoai() {
    }

    public DienThoai(int maDT, String tenDienThoai, String hinhAnh, int giaTien) {
        this.maDT = maDT;
        this.tenDienThoai = tenDienThoai;
        this.hinhAnh = hinhAnh;
        this.giaTien = giaTien;
    }

    public int getMaDT() {
        return maDT;
    }

    public void setMaDT(int maDT) {
        this.maDT = maDT;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
}
