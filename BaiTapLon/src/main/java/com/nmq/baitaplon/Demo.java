/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nmq.baitaplon;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.prefs.BackingStoreException;

/**
 *
 * @author Admin
 */
public class Demo {

    public static void main(String[] args) throws ParseException, ClassNotFoundException {

        SanPham sp1 = new ThucAn("Pho bo", true, 35000, ThoiDiemBan.SANG, true);
        SanPham sp2 = new ThucUong("Tra dao", true, 40000, ThoiDiemBan.CHIEU, false);
        SanPham sp3 = new ThucAn("Pho ga", false, 45000, ThoiDiemBan.TRUA, false);
        SanPham sp4 = new ThucUong("Tra dau", false, 25000, ThoiDiemBan.SANG, true);
//
        QuanLySanPham qlsp = new QuanLySanPham();
        qlsp.themSP(sp1, sp2, sp3, sp4);
// ============Ban=============

        Ban b1 = new Ban(1, 4, true);
        Ban b2 = new Ban(2, 5, true);
        Ban b3 = new Ban(3, 6, false);
        QuanLyBan qlBan = new QuanLyBan();
        qlBan.themBan(b1, b2, b3);

//=====================================NhanVien========================================================
        NhanVien nv1 = new NhanVien("Nguyen Van A", "Nam", "Binh Dinh", "01/04/2003", "03/04/2023");
        NhanVien nv2 = new NhanVien("Vo Thi B", "Nu", "Gia Lai", "16/02/2001", "23/04/2021");
        NhanVien nv3 = new NhanVien("Nguyen Minh Triet", "Nu", "Gia Lai", "11/04/2001", "27/04/2020");
        NhanVien nv4 = new NhanVien("Nguyen Minh Quan", "Nu", "Gia Lai", "17/02/2001", "09/12/2022");
        NhanVien nv5 = new NhanVien("Vo Thi Linh", "Nam", "Quang Ngai", "20/03/2002", "13/07/2021");
        QuanLyNhanVien qlnv = new QuanLyNhanVien();

        BoPhan bp1 = new BoPhan("Ke toan");
        BoPhan bp2 = new BoPhan("Pha che");
        BoPhan bp3 = new BoPhan("Phuc vu");
        BoPhan bp4 = new BoPhan("Tiep tan");
        QuanLyBoPhan qlbp = new QuanLyBoPhan();
        qlbp.themBoPhan(bp1, bp2, bp3, bp4);

        nv1.setBoPhanTrucThuoc(bp1);
        nv2.setBoPhanTrucThuoc(bp2);
        nv3.setBoPhanTrucThuoc(bp3);
        nv4.setBoPhanTrucThuoc(bp4);

        HoaDon hd1 = new HoaDon(b1);
        hd1.setNhanVienXuatHoaDon(nv5);

        hd1.datHoaDon(sp1, 3);
        hd1.datHoaDon(sp3, 2);

        QuanLyHoaDon qlHoaDon = new QuanLyHoaDon();
        qlHoaDon.themHoaDon(hd1);

        qlnv.themNV(nv1, nv2, nv3, nv4, nv5);
        CauHinh cauHinh = new CauHinh();

        int chon;
        do {
            System.out.println("==================QUẢN LÝ QUÁN CÀ PHÊ =================");
            cauHinh.menuQuanLyQuanCaPhe();
            chon = CauHinh.sc.nextInt();
            switch (chon) {
                case 1: { //Quan ly nhan vien
                    do {
                        cauHinh.menuQuanLyNhanVien();
                        int chonNV;
                        chonNV = cauHinh.sc.nextInt();
                        CauHinh.sc.nextLine();
                        switch (chonNV) {
                            case 0:
                                break;
                            case 1:// Xem danh sách nhân viên
                                qlnv.xemDsNV();
                                break;
                            case 2:// tra cứu nhân viên theo tên 
//                                
                                qlnv.traCuuTen().forEach(h -> h.hienThiThongTinNhanVien());
                                break;
                            case 3://tra cứu nhân viên theo giới tính
//                              
                                qlnv.traCuuGT().forEach(h -> h.hienThiThongTinNhanVien());
                                break;
                            case 4:// tra cứu nhân viên theo ngày sinh
//                               
                                qlnv.traCuuDate().forEach(h -> h.hienThiThongTinNhanVien());
                                break;
                            case 5: {// tra cứu nhân viên theo quê quán
//                               
                                qlnv.traCuuQQ().forEach(h -> h.hienThiThongTinNhanVien());
                                break;
                            }
                            case 6://Thêm nhân viên
                                NhanVien nvNew = new NhanVien();
                                nvNew.nhapThongTinNhanVien();
                                qlnv.themNV(nvNew);
                                qlbp.hienThi();
                                System.out.println("Nhap ma bo phan ban can them vao nhan vien");
                                int mBP = CauHinh.sc.nextInt();
                                qlbp.timKiemMBP(mBP).themNhanVienChoBoPhan(nvNew);
                                nvNew.setBoPhanTrucThuoc(qlbp.timKiemMBP(mBP));
                                qlnv.xemDsNV();
                                break;
                            case 7: {// Sửa thông tin nhân viên
                                System.out.println("Nhap ma nhan vien muon cap nhat: ");
                                int maNV = CauHinh.sc.nextInt();
                                qlnv.suaNV(maNV);
                                System.out.println("Ban muon sua bo phan cua nhan vien khong?\n 1. Co\n2. Khong\nNhap: ");
                                int suaBP = CauHinh.sc.nextInt();
                                if (suaBP == 1) {
                                    System.out.println("Nhap ma bo phan moi ban muon gan nhan vien vao: ");
                                    int maBPMoi = CauHinh.sc.nextInt();
                                    qlnv.timKiemNhanVienTheoMa(maNV).setBoPhanTrucThuoc(qlbp.timKiemMBP(maBPMoi));
                                }

                                qlnv.xemDsNV();
                                break;
                            }
                            case 8:// Xóa nhân viên 

                                qlnv.xoaNV();
                                qlnv.xemDsNV();
                                break;

                            case 9: {//Xác định nhân viên có sinh nhật trong tháng hiện tại
                                qlnv.xacDinhSinhNhatTheoThangHienTai().forEach(h -> h.hienThiThongTinNhanVien());

                                break;
                            }

                            default:
                                throw new AssertionError();
                        }
                    } while (chon != 9);
                    
                    break;
                }
                case 2: {//quan ly ban
                    do {
                        cauHinh.menuQuanLyBan();
                        int chonBan;
                        chonBan = cauHinh.sc.nextInt();
                        CauHinh.sc.nextLine();
                        switch (chonBan) {
                            case 1:// xem danh sách bàn trống
                                qlBan.xemDsBanTrong().forEach(h -> h.hienThiThongTinBan());
                                break;
                            case 2:// thêm thông tin bàn mới
                                qlBan.them();
                                qlBan.hienThi();
                                break;
                            case 3:// sửa thông tin bàn
                                qlBan.suaBan();
                                qlBan.hienThi();
                                break;
                            case 4:// xóa thông tin bàn
                                System.out.println("Nhap ma ban can xoa: ");
                                int mb = CauHinh.sc.nextInt();
                                qlBan.xoaBan(mb);
                                qlBan.hienThi();
                                break;
                            case 5:// tìm kiếm bàn theo sức chứa
                                System.out.println("Nhap suc chua ban muon tim: ");
                                int scb = CauHinh.sc.nextInt();
                                qlBan.timKiem(scb).forEach(c -> c.hienThiThongTinBan());

                                break;
                            default:
                                throw new AssertionError();
                        }
                    } while (chon != 0);

                    break;
                }
                case 3: { //quan ly san pham
                    do {
                        cauHinh.menuQuanLySanPham();
                        int chonSanPham;
                        chonSanPham = CauHinh.sc.nextInt();
                        CauHinh.sc.nextLine();
                        switch (chonSanPham) {
                            case 1:// Thêm thông tin thức ăn/ thức uống 
                                qlsp.themSanPham();
                                qlsp.hienThi();
                                break;
                            case 2:// Xóa thông tin thức ăn/ thức uống
                                qlsp.xoaSP();
                                qlsp.hienThi();
                                break;
                            case 3:// tìm kiếm sản phẩm theo tên
                                System.out.println("Nhap ten san pham ban muon tim: ");
                                String ten = CauHinh.sc.nextLine();
                                qlsp.timKiemTheoTenSP(ten).forEach(h -> System.out.println(h));
                                break;
                            case 4:// tìm kiếm sản phẩm theo khoảng giá
                                System.out.println("Nhap khoang gia ban muon tim:");
                                System.out.print("Tu khoang :");
                                Double minGiaBan = CauHinh.sc.nextDouble();
                                System.out.print("Den :");
                                Double maxGiaBan = CauHinh.sc.nextDouble();

                                qlsp.timKiemTheoGiaSP(minGiaBan, maxGiaBan).forEach(h -> System.out.println(h));
                                break;
                            case 5:// Sắp xếp sản phẩm giảm dần theo giá 
                                qlsp.sapXepSP();
                                break;
                            default:
                                throw new AssertionError();
                        }

                    } while (chon != 0);
                    break;
                }
                case 4: { //Quan ly hoa don 

                    do {
                        cauHinh.menuQuanLyHoaDon();
                        int chonHoaDon;
                        chonHoaDon = CauHinh.sc.nextInt();
                        CauHinh.sc.nextLine();
                        switch (chonHoaDon) {
                            case 1: { //dat ban 
                                System.out.println("Nhap ma ban ban can dat");
                                int maBan = CauHinh.sc.nextInt();

                                if (qlBan.timKiemMaBan(maBan).isTinhTrang() == true) {
                                    qlsp.hienThi();

                                    int chonthemSanPham;
                                    HoaDon hdNew = new HoaDon(qlBan.timKiemMaBan(maBan));

                                    do {
                                        System.out.println("Nhap ma thuc an ban muon dat ");
                                        int maThucAn = CauHinh.sc.nextInt();
                                        System.out.println("Nhap so luoong");
                                        int soLuong = CauHinh.sc.nextInt();
                                        hdNew.datHoaDon(qlsp.timKiemMaSanPham(maThucAn), soLuong);
                                        System.out.println("Ban co muon nhap them san pham: \n1.Co \n2.Khong");
                                        chonthemSanPham = CauHinh.sc.nextInt();
                                    } while (chonthemSanPham != 2);

                                    hdNew.setNhanVienXuatHoaDon(nv5);
                                    System.out.println("Ban da dat hoa don thanh cong");
                                    hdNew.hienThiThongTinHoaDon();
                                    qlHoaDon.themHoaDon(hdNew); //them hoa don vao danh sach hoa don 

                                } else {
                                    System.out.println("Ban nay khong con trong");
                                    break;
                                }

                                break;
                            }
                            case 2:// thong ke doanh thu theo thang

                                break;
                            case 3:// thong ke doanh thu theo khoang thoi gian chi dinh

                                break;
                            case 4: {// Hien thi tat ca hoa don
                                qlHoaDon.hienThi();
                                break;
                            }
                            default:
                                throw new AssertionError();
                        }

                    } while (chon != 0);
                    break;
                }

                default:
                    throw new AssertionError();
            }
        } while (chon != 0);
    }
}
