/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class DanhSachHinh{
    ArrayList<Hinh> dshinh;

    public DanhSachHinh() {
        dshinh=new ArrayList<>();
//        dshinh.add(new HinhChuNhat(2,3));
//        dshinh.add(new HinhTron(4));
//        dshinh.add(new HinhChuNhat(1,2));
        
    }

    
    
    public  void Them(Hinh hinh){
        dshinh.add(hinh);
    }
    public void inDanhSach(){
        for(Hinh i:dshinh){
            System.out.println(i.toString());
        }
    }
}
