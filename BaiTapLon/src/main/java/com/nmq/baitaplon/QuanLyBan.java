package com.nmq.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyBan {

    private List<Ban> dsBan = new ArrayList<>();

    public void themBan(Ban... b) {
        this.dsBan.addAll(Arrays.asList(b));

    }

    public void hienThi() {
        this.dsBan.forEach(b -> b.hienThiThongTinBan());
    }

    public void them() {

        System.out.println("Suc chua ban:");
        int scb = CauHinh.sc.nextInt();
        CauHinh.sc.nextLine();

        System.out.println("Tinh trang ban: \n1.Con \n2.Het ban");

        int tinhTrang = CauHinh.sc.nextInt();
        Boolean tt = false;
        if (tinhTrang == 1) {
            tt = true;
        }

//            this.dsBan.add(new Ban(mb, scb,Boolean.parseBoolean(tt)));
        this.dsBan.add(new Ban(scb, tt));

    }
    
    
    

    public Ban timKiemMaBan(int maBan){
        return this.dsBan.stream().filter(m ->m.getMaBan()== maBan).findFirst().get();
        
    }
    public List<Ban> xemDsBanTrong() {
        return this.dsBan.stream().filter(h -> h.isTinhTrang() == false).collect(Collectors.toList());
    }

    public void suaBan() {
        System.out.println("Nhap ma ban ban can cap nhat : ");
        int mb = CauHinh.sc.nextInt();
        System.out.println("Suc chua ban:");
        int scb = CauHinh.sc.nextInt();
        CauHinh.sc.nextLine();

        System.out.println("Tinh trang ban: \n1.Con \n2.Het ban");

        int tinhTrang = CauHinh.sc.nextInt();
        Boolean tt = false;
        if (tinhTrang == 1) {
            tt = true;
        }
        
        for (Ban b : dsBan) {
            if (b.getMaBan() == mb) {
                b.setSucChua(scb);
                b.setTinhTrang(tt);
                System.out.println("Ban da cap nhat thong tin thanh cong");
                return ;
            }
                
        }
            System.out.println("Khong tim thay ban co ma ban la"+mb);
//        this.dsBan.set(maBan, b);

    }

    public List<Ban> xoaBan(int mb) {
        this.getDsBan().removeIf(h -> Integer.toString(h.getMaBan()).contains(Integer.toString(mb)));
        return dsBan;
    }

    public List<Ban> timKiem(int scb) {
        return this.dsBan.stream().filter(b -> Integer.toString(b.getSucChua()).contains(Integer.toString(scb))).collect(Collectors.toList());
    }

    /**
     * @return the dsBan
     */
    public List<Ban> getDsBan() {
        return dsBan;
    }

    /**
     * @param dsBan the dsBan to set
     */
    public void setDsBan(List<Ban> dsBan) {
        this.dsBan = dsBan;
    }

}
