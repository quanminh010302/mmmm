package com.nmq.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoPhan {

    private static int dem;
    private int maBoPhan = ++dem;

    private String tenBoPhan;
    private List<NhanVien> dsNV = new ArrayList<>();

    public BoPhan(String tenBoPhan, List<NhanVien> dsNV) {
        this.tenBoPhan = tenBoPhan;
        this.dsNV = dsNV;
    }

    public BoPhan(String tenBoPhan) {

        this.tenBoPhan = tenBoPhan;

    }



    public void hienThiThongTinBoPhan() {
        System.out.printf("\tMa Bo Phan Truc Thuoc : %d\n", this.maBoPhan);
        System.out.printf("\tTen Bo Phan Truc Thuoc : %s\n", this.tenBoPhan);
        System.out.println("---------------------------------");
    }

    public void themNhanVienChoBoPhan(NhanVien... b) {
        this.dsNV.addAll(Arrays.asList(b));
    }

    /**
     * @return the maBoPhan
     */
    public int getMaBoPhan() {
        return maBoPhan;
    }

    /**
     * @param maBoPhan the maBoPhan to set
     */
    public void setMaBoPhan(int maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    /**
     * @return the tenBoPhan
     */
    public String getTenBoPhan() {
        return tenBoPhan;
    }

    /**
     * @param tenBoPhan the tenBoPhan to set
     */
    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    /**
     * @return the dsNV
     */
    public List<NhanVien> getDsNV() {
        return dsNV;
    }

    /**
     * @param dsNV the dsNV to set
     */
    public void setDsNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }

}
