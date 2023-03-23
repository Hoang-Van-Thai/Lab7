/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ADMIN
 */
public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang() {
    }
    public GiaoDichVang(String maGD, String ngayGD, float donGia, float soLuong){
        super(maGD, ngayGD, donGia, soLuong);
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    
    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    
    @Override
    public float thanhTien() {
        return this.getSoLuong()*this.getSoLuong(); 
    }
    
    
}
