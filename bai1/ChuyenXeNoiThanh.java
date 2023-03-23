/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ADMIN
 */
public class ChuyenXeNoiThanh extends chuyenxe {
    private int soTuyen;
    private float soKMDiDuoc;

    public ChuyenXeNoiThanh() {
        
    }
    

    public ChuyenXeNoiThanh(int soTuyen, float soKMDiDuoc) {
        this.soTuyen = soTuyen;
        this.soKMDiDuoc = soKMDiDuoc;
    }
    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, float doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    }
    

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getSoKMDiDuoc() {
        return soKMDiDuoc;
    }

    public void setSoKMDiDuoc(float soKMDiDuoc) {
        this.soKMDiDuoc = soKMDiDuoc;
    }
    

    @Override
    public float xuatDoanhThu() {
        return super.xuatDoanhThu(); 
    }
}
