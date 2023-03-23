/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ADMIN
 */
public class ChuyenXeNgoaiThanh extends chuyenxe {
     private String noiDen;
    private int ngayDiDuoc;

    public ChuyenXeNgoaiThanh() {
    }
    

    public ChuyenXeNgoaiThanh(String noiDen, int ngayDiDuoc) {
        this.noiDen = noiDen;
        this.ngayDiDuoc = ngayDiDuoc;
    }
    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, float doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    }
    

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getNgayDiDuoc() {
        return ngayDiDuoc;
    }

    public void setNgayDiDuoc(int ngayDiDuoc) {
        this.ngayDiDuoc = ngayDiDuoc;
    }

    @Override
    public float xuatDoanhThu() {
        return super.xuatDoanhThu(); 
    }

}
