/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phuongtrinh;

import Giaiphuongtrinh.IGiaiPhuongTrinh;
import Nhapthamso.INhapthamso;
import Xulyketqua.IXuLyKetQua;
import java.util.List;

/**
 *
 * @author DELL
 */
public abstract class PhuongTrinh {
    List<Integer> thamso;
    List<Double>nghiem;
    int bac;
    INhapthamso nhapthamso;
    IGiaiPhuongTrinh giaiphuongtrinh;
    IXuLyKetQua xulyketqua;

    public List<Double> getNghiem() {
        return nghiem;
    }

    public int getBac() {
        return bac;
    }
   
    public abstract void nhapthamso();
    public abstract void Giaiphuongtrinh();
    public abstract void Xulyketqua();
}
