package com.nmq.baitaplon;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class HoaDon {


    private static int dem;
    private int maHoaDon = ++dem;

    private Date ngayTaoHoaDon;

    private NhanVien nhanVienXuatHoaDon;
    private Ban ban;
    private List<SanPham> dsSanPham = new ArrayList<>();

    
    private HashMap<SanPham, Integer> danhSachMonAn;

    public HoaDon(Date ngayTaoHoaDon, NhanVien nhanVienXuatHoaDon, Ban ban, HashMap<SanPham, Integer> danhSachMonAn) {
        this.ngayTaoHoaDon = ngayTaoHoaDon;
        this.nhanVienXuatHoaDon = nhanVienXuatHoaDon;
      
        this.ban = ban;
        this.danhSachMonAn = danhSachMonAn;
    }

    
    public HoaDon(Ban ban) {
        this.ban = ban;
        this.danhSachMonAn = new HashMap<SanPham, Integer>();
        Date date = new Date(System.currentTimeMillis());
        this.ngayTaoHoaDon = date; //lay thoi gian hien tai
    }
//

    public void datHoaDon( SanPham sanPham, int soLuong) {
        if (danhSachMonAn.containsKey(sanPham)) {
            int soLuongHienTai = danhSachMonAn.get(sanPham);
            danhSachMonAn.put(sanPham, soLuongHienTai + soLuong);
        } else {
            danhSachMonAn.put(sanPham, soLuong);
        }
        
    }
    
    public double thanhToanHoaDon() {
        double tongTien = 0.0;

        for (SanPham sanPham : danhSachMonAn.keySet()) {
            int soLuong = danhSachMonAn.get(sanPham);
            tongTien += sanPham.getGiaTien() * soLuong;

        }
        return tongTien;
    }


    public void hienThiThongTinHoaDon() {
        System.out.printf("Ma hoa don: %d\n", this.maHoaDon);
        System.out.printf("Ma ban: B%03d\n", this.ban.getMaBan());
        System.out.println("====Danh sach san pham====");
        for (Map.Entry<SanPham, Integer> entry : danhSachMonAn.entrySet()) {
            SanPham sanPham = entry.getKey();
            int soLuong = entry.getValue();
            System.out.println("Ten San Pham: " + sanPham.getTen() + "\tSo luong: " + soLuong);
        }
        System.out.printf("Ngay tao hoa don: %s\n", CauHinh.F.format(ngayTaoHoaDon));
        System.out.printf("Nhan vien lap hoa don: %s\n", this.nhanVienXuatHoaDon.getHoTenNV());
        System.out.printf("Tong tien can thanh toan: %s\n", CauHinh.fTien.format(this.thanhToanHoaDon()));
    }


    /**
     * @return the maHoaDon
     */
    public int getMaHoaDon() {
        return maHoaDon;
    }

    /**
     * @param maHoaDon the maHoaDon to set
     */
    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    /**
     * @return the ngayTaoHoaDon
     */
    public Date getNgayTaoHoaDon() {
        return ngayTaoHoaDon;
    }

    /**
     * @param ngayTaoHoaDon the ngayTaoHoaDon to set
     */
    public void setNgayTaoHoaDon(Date ngayTaoHoaDon) {
        this.ngayTaoHoaDon = ngayTaoHoaDon;
    }

    /**
     * @return the nhanVienXuatHoaDon
     */
    public NhanVien getNhanVienXuatHoaDon() {
        return nhanVienXuatHoaDon;
    }

    /**
     * @param nhanVienXuatHoaDon the nhanVienXuatHoaDon to set
     */
    public void setNhanVienXuatHoaDon(NhanVien nhanVienXuatHoaDon) {
        this.nhanVienXuatHoaDon = nhanVienXuatHoaDon;
    }

    /**
     * @return the dsSanPham
     */
    public List<SanPham> getDsSanPham() {
        return dsSanPham;
    }

    /**
     * @param dsSanPham the dsSanPham to set
     */
    public void setDsSanPham(List<SanPham> dsSanPham) {
        this.dsSanPham = dsSanPham;
    }
        public Ban getBan() {
        return ban;
    }

    /**
     * @param ban the ban to set
     */
    public void setBan(Ban ban) {
        this.ban = ban;
    }


}
