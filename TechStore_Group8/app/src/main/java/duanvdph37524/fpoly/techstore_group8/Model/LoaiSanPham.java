package duanvdph37524.fpoly.techstore_group8.Model;

public class LoaiSanPham {
    private String maLoai;
    private String tenLoai,hinhAnh;

    public LoaiSanPham() {
    }


    public LoaiSanPham(String maLoai, String tenLoai, String hinhAnh) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.hinhAnh = hinhAnh;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
