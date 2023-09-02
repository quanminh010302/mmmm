/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmq.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyBoPhan {
    private List<BoPhan> dsBoPhan = new ArrayList<>();
    
    
    public void themBoPhan(BoPhan...bp){
        this.dsBoPhan.addAll(Arrays.asList(bp));
    }
        public void hienThi() {
        this.dsBoPhan.forEach(b -> b.hienThiThongTinBoPhan());
    }
        public BoPhan timKiemMBP(int mBP){
            return this.dsBoPhan.stream().filter(m ->m.getMaBoPhan() == mBP).findFirst().get();
        }
    /**
     * @return the dsBoPhan
     */
    public List<BoPhan> getDsBoPhan() {
        return dsBoPhan;
    }

    /**
     * @param dsBoPhan the dsBoPhan to set
     */
    public void setDsBoPhan(List<BoPhan> dsBoPhan) {
        this.dsBoPhan = dsBoPhan;
    }
}
