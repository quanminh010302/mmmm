package com.nmq.baitaplon;

public class ThucAn extends SanPham {

    private boolean anChay;

    public ThucAn(String ten, boolean tinhTrang, double giaTien, ThoiDiemBan thoiDiemBan, boolean anChay) {
        super(ten, tinhTrang, giaTien, thoiDiemBan);
        this.anChay = anChay;
    }

    public ThucAn() {

    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("\n1.An Man \n2.An Chay");
        int chonloai = CauHinh.sc.nextInt();
        
        if (chonloai == 1) {
            this.anChay = true;// An man
        }
        if (chonloai == 2) {
            this.anChay =false;// An chay
        }

    }

    @Override
    public String toString() {
        return super.toString() + String.format("Loai thuc an: %s", loaiDoAn());
    }

    public String loaiDoAn() {
        if (this.anChay) {
            return "An man";
        }
        return "An chay";
    }

    /**
     * @return the anChay
     */
    public boolean isAnChay() {
        return anChay;
    }

    /**
     * @param anChay the anChay to set
     */
    public void setAnChay(boolean anChay) {
        this.anChay = anChay;
    }

}
