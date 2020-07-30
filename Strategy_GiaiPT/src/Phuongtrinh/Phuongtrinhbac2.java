/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phuongtrinh;

import Giaiphuongtrinh.GiaiPTbac2;
import Nhapthamso.NhapTuBanPhim;
import Xulyketqua.Xuatramanhinh;

/**
 *
 * @author DELL
 */
public class Phuongtrinhbac2 extends PhuongTrinh{

    public Phuongtrinhbac2() {
        bac = 2;
        nhapthamso = new NhapTuBanPhim();
        giaiphuongtrinh = new GiaiPTbac2();
        xulyketqua = new Xuatramanhinh();
    }
    
    @Override
    public void nhapthamso() {
       thamso = nhapthamso.nhapThamSo(bac);
    }

    @Override
    public void Giaiphuongtrinh() {
        nghiem = giaiphuongtrinh.giaipt(thamso);
    }

    @Override
    public void Xulyketqua() {
        xulyketqua.xuLy(this);
    }
    
}
