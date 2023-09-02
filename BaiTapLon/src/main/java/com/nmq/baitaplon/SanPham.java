package com.nmq.baitaplon;

public abstract class SanPham {

    private static int dem;
    private int maSP = ++dem;
    protected String ten;

    protected boolean tinhTrang;

    protected double giaTien;

    private ThoiDiemBan thoiDiemBan;

    public SanPham(int maSP, String ten, boolean tinhTrang, double giaTien, ThoiDiemBan thoiDiemBan) {
        this.maSP = maSP;
        this.ten = ten;
        this.tinhTrang = tinhTrang;
        this.giaTien = giaTien;
        this.thoiDiemBan = thoiDiemBan;
    }

    public SanPham(String ten, boolean tinhTrang, double giaTien, ThoiDiemBan thoiDiemBan) {
        this.ten = ten;
        this.tinhTrang = tinhTrang;
        this.giaTien = giaTien;
        this.thoiDiemBan = thoiDiemBan;
    }
        public SanPham(String ten, double giaTien) {
        this.ten = ten;
        this.giaTien = giaTien;
        
    }


    public SanPham() {

    }

    public void nhap() {
        CauHinh.sc.nextLine();
        System.out.println("Ten San Pham");
        this.ten = CauHinh.sc.nextLine();
        this.tinhTrang = true;
        System.out.println("Gia ban san pham:");
        this.giaTien = CauHinh.sc.nextDouble();
        CauHinh.sc.nextLine();
        int chonTD;
        System.out.println("Thoi diem ban:\n1.Sang \n2.Trua \n3.Chieu ");
        chonTD = CauHinh.sc.nextInt();
        do {
            if (chonTD == 1) {
                this.thoiDiemBan = ThoiDiemBan.SANG;
            }
            if (chonTD == 2) {
                this.thoiDiemBan = ThoiDiemBan.TRUA;
            }
            if (chonTD == 3) {
                this.thoiDiemBan = ThoiDiemBan.CHIEU;
            }
            if (chonTD <= 0 && chonTD >= 3) {

                System.out.println("Khong co su lua chon cua ban!Chon lai");
            }
        } while (chonTD <= 0 && chonTD >= 3);
    }

    @Override
    public String toString() {
        return String.format("\nMa San Pham: %s\n Ten: %s\nTinh trang: %s\nGia Ban: %s\nThoi diem ban: %s\n", this.getMaSP(),
                this.getTen(), xuatTinhTrang(), CauHinh.fTien.format(this.giaTien), this.getThoiDiemBan());

    }

    public String xuatTinhTrang() {
        if (this.tinhTrang) {
            return "Con";
        }
        return "Het";
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the tinhTrang
     */
    public boolean isTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the maSP
     */
    public int getMaSP() {
        return maSP;
    }

    /**
     * @param maSP the maSP to set
     */
    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    /**
     * @return the giaTien
     */
    public double getGiaTien() {
        return giaTien;
    }

    /**
     * @param giaTien the giaTien to set
     */
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    /**
     * @return the thoiDiemBan
     */
    public ThoiDiemBan getThoiDiemBan() {
        return thoiDiemBan;
    }

    /**
     * @param thoiDiemBan the thoiDiemBan to set
     */
    public void setThoiDiemBan(ThoiDiemBan thoiDiemBan) {
        this.thoiDiemBan = thoiDiemBan;
    }
}
