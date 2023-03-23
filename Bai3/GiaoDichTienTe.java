/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ADMIN
 */
public class GiaoDichTienTe extends GiaoDich {
    private String tiGia;
    private String loaiTiente;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(String tiGia, String loaiTiente) {
        this.tiGia = tiGia;
        this.loaiTiente = loaiTiente;
    }

    public GiaoDichTienTe(String maGD, String ngayGD, float donGia, float soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
    }

    
    
    public String getTiGia() {
        return tiGia;
    }

    public void setTiGia(String tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTiente() {
        return loaiTiente;
    }

    public void setLoaiTiente(String loaiTiente) {
        this.loaiTiente = loaiTiente;
    }

    @Override
    public float thanhTien() {
        if(loaiTiente=="Viet"){
            return 
        }
        return 0;
    }
    
    
}
