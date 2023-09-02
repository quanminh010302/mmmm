package com.nmq.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLyHoaDon {

    private List<HoaDon> dsHoaDon = new ArrayList<>();

    public void themHoaDon(HoaDon hd) {

        this.dsHoaDon.addAll(Arrays.asList(hd));

    }
    
    public void hienThi() {
        this.dsHoaDon.forEach(h -> h.hienThiThongTinHoaDon());
    }

    public List<HoaDon> thongKeThang(int t) {
        return null;
    }

    public List<HoaDon> thongKeTime(String tg) {
        return null;
    }

    /**
     * @return the dsHoaDon
     */
    public List<HoaDon> getDsHoaDon() {
        return dsHoaDon;
    }

    /**
     * @param dsHoaDon the dsHoaDon to set
     */
    public void setDsHoaDon(List<HoaDon> dsHoaDon) {
        this.dsHoaDon = dsHoaDon;
    }

}
