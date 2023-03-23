/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author ADMIN
 */
public class HinhTron extends Hinh {
    private float r;

    public HinhTron() {
    }

    public HinhTron(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }

    @Override
    public double dienTich() {
        return r*r*3.14;
    }
    
}
