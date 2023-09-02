package com.nmq.baitaplon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySanPham {

    private List<SanPham> dsSanPham = new ArrayList<>();

    public void sapXepSP() {
             System.out.println("Danh sach ban muon giam dan theo gia san pham: \n1.Thuc An \n2.Thuc Uong");
             int chonLoaiDS=CauHinh.sc.nextInt();
             if(chonLoaiDS ==1){
                 
            this.dsSanPham.stream().filter(c->c instanceof ThucAn).sorted(Comparator.comparing(SanPham::getGiaTien).reversed()).forEach(c->System.out.println(c));
             }
             if(chonLoaiDS ==2 ){
                 
            this.dsSanPham.stream().filter(c->c instanceof ThucUong).sorted(Comparator.comparing(SanPham::getGiaTien).reversed()).forEach(c->System.out.println(c));
             }
//        this.dsSanPham.sort(Comparator.comparing(SanPham::getGiaTien));
        
    }
    public SanPham timKiemMaSanPham(int maSP){
           
        return this.dsSanPham.stream().filter(sp ->sp.getMaSP()== maSP).findFirst().get();
        
    }

    public List<SanPham> timKiemTheoTenSP(String ten) {
        return this.dsSanPham.stream().filter(h -> h.getTen().contains(ten)).collect(Collectors.toList());
    }

    public List<SanPham> timKiemTheoGiaSP(double minGiaBan, double maxGiaBan) {
        return this.dsSanPham.stream().filter(h -> h.getGiaTien() >= minGiaBan && h.getGiaTien() <= maxGiaBan).collect(Collectors.toList());
    }

    public void themSP(SanPham... sp) {
        this.dsSanPham.addAll(Arrays.asList(sp));

    }

    public void themSanPham() {
        System.out.println(" \n1.Thuc An \n2.Thuc Uong");
        int chon = CauHinh.sc.nextInt();
        if (chon == 1) {
            SanPham sp1 = new ThucAn();
            sp1.nhap();
            this.dsSanPham.add(sp1);
        }
        if (chon == 2) {
            SanPham sp1 = new ThucUong();
            sp1.nhap();
            this.dsSanPham.add(sp1);

        }
        
    }

    public void hienThi() {
        this.dsSanPham.forEach(h -> System.out.println(h));
    }


    public void xoaSP() {
        System.out.println("Nhap ten san pham muon xoa:");
        String xoaSP = CauHinh.sc.nextLine();
        this.dsSanPham.removeIf(s -> s.getTen().contains(xoaSP) == true);

    }

}
