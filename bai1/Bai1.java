/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author ADMIN
 */


public class Bai1 {
    public static void main(String[] args) {
        chuyenxe CX=new ChuyenXeNoiThanh("abc", "thai", 1, 250);
        System.out.println(CX.xuatDoanhThu());
        chuyenxe CX1=new ChuyenXeNgoaiThanh("abcd", "hoang", 2, 300);
        System.out.println(CX1.xuatDoanhThu());
        System.out.println(CX.xuatDoanhThu()+CX1.xuatDoanhThu());
        
    }
    
}
