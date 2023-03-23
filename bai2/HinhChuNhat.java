/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author ADMIN
 */
public class HinhChuNhat extends Hinh {
    private float cd,cr;

    public HinhChuNhat() {
    }
    

    
    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhiat{" + "cd=" + cd + ", cr=" + cr + '}';
    }

    @Override
    public double dienTich() {
        return cd*cr;
    }
    
    
}
