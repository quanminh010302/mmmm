package com.nmq.baitaplon;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyNhanVien {

    private List<NhanVien> dsNhanVien = new ArrayList<>();

    public List<NhanVien> xacDinhSinhNhatTheoThangHienTai() {
        System.out.println("-------------Danh sach nhan vien sinh trong thang hien tai:-------------");
        LocalDate now = LocalDate.now();
        int thangHienTai = now.getMonthValue(); //thang hien tai
        return this.dsNhanVien.stream().filter(nv -> (nv.getNgaySinh().getMonth() + 1) == thangHienTai).collect(Collectors.toList());

    }

    public List<NhanVien> xemDsNV() {
        dsNhanVien.forEach(c -> c.hienThiThongTinNhanVien());

        return dsNhanVien;
    }

    public List<NhanVien> traCuuTen() {
        System.out.println("Nhap ten nhan vien can tim: ");
        String ten = CauHinh.sc.nextLine();
        return this.dsNhanVien.stream().filter(h -> h.getHoTenNV().contains(ten)).collect(Collectors.toList());
    }

    public List<NhanVien> traCuuGT() {
        System.out.println("Nhap gioi tinh nhan vien can tim: ");
        String gioiTinh = CauHinh.sc.nextLine();
        return this.dsNhanVien.stream().filter(h -> h.getGioiTinh().contains(gioiTinh)).collect(Collectors.toList());

    }

    public List<NhanVien> traCuuDate() throws ParseException {
        System.out.println("Nhap ngay sinh nhan vien can tim: ");
        Date nsNV = CauHinh.F.parse(CauHinh.sc.nextLine());

        return this.dsNhanVien.stream().filter(h -> h.getNgaySinh().equals(nsNV)).collect(Collectors.toList());

    }

    public List<NhanVien> traCuuQQ() {
        System.out.println("Nhap que quan nhan vien can tim: ");
        String queQuan = CauHinh.sc.nextLine();
        return this.dsNhanVien.stream().filter(h -> h.getQueQuan().contains(queQuan)).collect(Collectors.toList());

    }

    public void themNV(NhanVien... nv) {
        this.dsNhanVien.addAll(Arrays.asList(nv));

    }

    public void xoaNV() {// Ve nha sua lai phan nay
        System.out.println("Nhap thong tin nhan vien ban muon xoa:");
        System.out.println("Nhap ma nhan vien can xoa: ");
        int mnv = CauHinh.sc.nextInt();
        this.getDsNhanVien().removeIf(h -> Integer.toString(h.getMaNV()).contains(Integer.toString(mnv)));
    }

    public void suaNV(int maNV) throws ParseException {

        CauHinh.sc.nextLine();
        System.out.println("Ho ten nhan vien: ");
        String ten = CauHinh.sc.nextLine();
        System.out.println("Gioi tinh nhan vien : ");
        String gt = CauHinh.sc.nextLine();
        System.out.println("Que quan nhan vien: ");
        String qq = CauHinh.sc.nextLine();
        System.out.println("Ngay Sinh  nhan vien: ");
        Date nsNV = CauHinh.F.parse(CauHinh.sc.nextLine());
        System.out.println("Ngay vao lam  nhan vien: ");

        Date nvlNV = CauHinh.F.parse(CauHinh.sc.nextLine());
        for (NhanVien nv : dsNhanVien) {
            if (nv.getMaNV() == maNV) {
                nv.setHoTenNV(ten);
                nv.setGioiTinh(gt);
                nv.setNgaySinh(nsNV);
                nv.setQueQuan(qq);
                nv.setNgayVaoLam(nvlNV);

                System.out.println("Ban da cap nhat thong tin nhan vien thanh cong");
                return;
            }

        }
        System.out.println("Khong tim thay ban co ma nhan vien la" + maNV);

    }

    public NhanVien timKiemNhanVienTheoMa(int ma) {
        return this.dsNhanVien.stream().filter(h -> h.getMaNV() == ma).findFirst().get();
    }

    /**
     * @return the dsNhanVien
     */
    public List<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    /**
     * @param dsNhanVien the dsNhanVien to set
     */
    public void setDsNhanVien(List<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

}
