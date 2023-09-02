package com.nmq.baitaplon;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;

public class NhanVien {

    private static int dem;
    private int maNV = ++dem;

    private String hoTenNV;

    private String gioiTinh;

    private String queQuan;

    private Date ngaySinh;

    private Date ngayVaoLam;

    private BoPhan boPhanTrucThuoc;


    public NhanVien(String hoTenNV, String gioiTinh, String queQuan, Date ngaySinh, Date ngayVaoLam, BoPhan boPhanTrucThuoc) {

        this.hoTenNV = hoTenNV;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhanTrucThuoc = boPhanTrucThuoc;
    }

    public NhanVien(String hoTenNV, String gioiTinh, String queQuan, String ngaySinh, String ngayVaoLam) throws ParseException {
        this.hoTenNV = hoTenNV;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = CauHinh.F.parse(ngaySinh);
        this.ngayVaoLam = CauHinh.F.parse(ngayVaoLam);
    }

    public NhanVien() {

    }

    public void hienThiThongTinNhanVien() {// them thuoc tinh maNV, getter setter, constructor

        System.out.printf("Ma nhan vien: %d\n", this.maNV);
        System.out.printf("Ho ten nhan vien: %s\n", this.hoTenNV);
        System.out.printf("Gioi tinh nhan vien: %s\n", this.gioiTinh);
        System.out.printf("Que Quan nhan vien: %s\n", this.queQuan);
        System.out.printf("Ngay Sinh nhan vien: %s\n", CauHinh.F.format(this.ngaySinh));
        System.out.printf("Ngay vao lam nhan vien: %s\n", CauHinh.F.format(this.ngayVaoLam));
        System.out.println("---------------Bo phan truc thuoc cua nhan vien---------------");

        if (this.boPhanTrucThuoc != null) {

            this.boPhanTrucThuoc.hienThiThongTinBoPhan();
        }

        System.out.println("===========================================");

    }

    public void nhapThongTinNhanVien    () throws ParseException {
        System.out.println("Nhap thong tin nhan vien ban muon them:");
        System.out.println("--------------------------");
        System.out.println("Ho ten nhan vien: ");
        this.hoTenNV = CauHinh.sc.nextLine();
        System.out.println("Gioi tinh nhan vien : ");
        this.gioiTinh = CauHinh.sc.nextLine();
        System.out.println("Que quan nhan vien: ");
        this.queQuan = CauHinh.sc.nextLine();
        System.out.println("Ngay Sinh  nhan vien: ");
        this.ngaySinh = CauHinh.F.parse(CauHinh.sc.nextLine());
        System.out.println("Ngay vao lam  nhan vien: ");
        this.ngayVaoLam = CauHinh.F.parse(CauHinh.sc.nextLine());

    }

    /**
     * @return the hoTenNV
     */
    public String getHoTenNV() {
        return hoTenNV;
    }

    /**
     * @param hoTenNV the hoTenNV to set
     */
    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayVaoLam
     */
    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    /**
     * @param ngayVaoLam the ngayVaoLam to set
     */
    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    /**
     * @return the boPhanTrucThuoc
     */
    public BoPhan getBoPhanTrucThuoc() {
        return boPhanTrucThuoc;
    }

    /**
     * @param boPhanTrucThuoc the boPhanTrucThuoc to set
     */
    public void setBoPhanTrucThuoc(BoPhan boPhanTrucThuoc) {
        this.boPhanTrucThuoc = boPhanTrucThuoc;
    }

    /**
     * @return the maNV
     */
    public int getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

}
