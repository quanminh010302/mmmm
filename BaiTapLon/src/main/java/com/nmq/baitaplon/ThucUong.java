package com.nmq.baitaplon;

import java.math.BigDecimal;

public class ThucUong extends SanPham {

	private boolean coDa;

    public ThucUong( String ten, boolean tinhTrang, double giaTien, ThoiDiemBan thoiDiemBan,boolean coDa) {
        super(ten, tinhTrang, giaTien, thoiDiemBan);
        this.coDa = coDa;
    }
public ThucUong(){
    
}
       @Override
    public void nhap() {
        super.nhap();
        System.out.println("\n1.Co da \n2.Khong da");
        int chonloai = CauHinh.sc.nextInt();
        
        if (chonloai == 1) {
            this.coDa = true;
        }
        if (chonloai == 2) {
            this.coDa =false;
        }

    }

    
    @Override
    public String toString() {
        return super.toString() + String.format("Loai thuc uong: %s", loaiThucUong());
    }

    public String loaiThucUong() {
        if (this.coDa) {
            return "Co Da";
        }
        return "Khong Da";
    }

    /**
     * @return the coDa
     */
    public boolean isCoDa() {
        return coDa;
    }

    /**
     * @param coDa the coDa to set
     */
    public void setCoDa(boolean coDa) {
        this.coDa = coDa;
    }

}
