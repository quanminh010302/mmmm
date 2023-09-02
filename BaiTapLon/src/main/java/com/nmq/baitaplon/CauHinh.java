/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmq.baitaplon;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CauHinh {

    public final static SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    public final static Scanner sc = new Scanner(System.in);
    public final static DecimalFormat fTien = new DecimalFormat("###,###,###.##" + " VND");

    public void menuQuanLyQuanCaPhe() {
        System.out.println("1.Quan ly Nhan Vien:");
        System.out.println("2.Quan ly thong tin Ban");
        System.out.println("3.Quan ly Thuc An hoac Thuc Uong:");
        System.out.println("4.Quan Ly Doanh Thu");
    }

    public void menuQuanLyNhanVien() {
        System.out.println("1.Xem danh sách nhân viên ");
        System.out.println("2. Tra cuu nhan vien theo ten:");
        System.out.println("3. Tra cuu nhan vien theo gioi tinh:");
        System.out.println("4. Tra cuu nhan vien theo ngay sinh:");
        System.out.println("5. Tra cuu nhan vien theo que quan");
        System.out.println("6. Them thong tin nhan vien moi:");
        System.out.println("7. Cap nhat thong tin nhan vien:");
        System.out.println("8. Xoa thong tin nhan vien:");
        System.out.println("9. Xac dinh danh sach nhan vien sinh trong thang hien tai de to chuc sinh nhat: ");
        

    }

    public void menuQuanLyBan() {
        System.out.println("1.Xem danh sach ban trong: ");
        System.out.println("2. Them thong tin ban moi: ");
        System.out.println("3. Cap nhat thong tin ban:");
        System.out.println("4. Xoa thong tin ban: ");
        System.out.println("5. Tim kiem ban theo suc chua: ");
    }
    public void menuQuanLySanPham(){
        System.out.println("1.Them thuc an/thuc uong: ");
        System.out.println("2.Xoa thuc an/thuc uong ");
        System.out.println("3.Tim kiem thuc an/thuc uong theo ten: ");
        System.out.println("4.Tim kiem thuc an/thuc uong theo khoang gia: ");
        System.out.println("5.Sap xep danh sach thuc an/thuc uong giam dan theo gia: ");
    }
    public void menuQuanLyHoaDon () {
        System.out.println("1. Dat ban : ");
        System.out.println("3. Thong ke doanh thu theo thang ");
        System.out.println("4. Thong ke doanh thu theo khoang thoi gian chi dinh");
        System.out.println("5. Hien thi tat ca hoa don");
    }

//    QuanLyNhanVien qlnv =  new QuanLyNhanVien();
}
