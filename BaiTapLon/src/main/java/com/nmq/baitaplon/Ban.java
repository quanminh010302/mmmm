    package com.nmq.baitaplon;

public class Ban {
    private static int dem;
    private int maBan = ++ dem;

    private int sucChua;

    private boolean tinhTrang;

    public Ban(int maBan, int sucChua, boolean tinhTrang) {
        this.maBan = maBan;
        this.sucChua = sucChua;
        this.tinhTrang = tinhTrang;
    }
    public Ban(int maBan) {
        this.maBan = maBan;
    }
    public Ban( int sucChua, boolean tinhTrang) {
        
        this.sucChua = sucChua;
        this.tinhTrang = tinhTrang;
    }


     public void hienThiThongTinBan() {
       
        System.out.printf("Ma ban: B%03d\n", this.maBan);
        
        System.out.printf("Suc chua  ban: %s\n", this.sucChua);
        if (this.tinhTrang) {
            System.out.println("Tinh trang ban: Con ");
        } else {
            System.out.println("Tinh trang ban: Het Ban");
        }

//            System.out.printf("Tinh trang  ban: %s\n",this.tinhTrang);
        System.out.println("----------------------");
    }
    

    /**
     * @return the maBan
     */
    public int getMaBan() {
        return maBan;
    }

    /**
     * @param maBan the maBan to set
     */
    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
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

}
