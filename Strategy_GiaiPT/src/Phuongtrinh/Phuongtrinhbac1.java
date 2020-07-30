/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phuongtrinh;

import Giaiphuongtrinh.GiaiPTbac1;
import Nhapthamso.NhapTuBanPhim;
import Xulyketqua.Xuatramanhinh;

/**
 *
 * @author DELL
 */
public class Phuongtrinhbac1 extends PhuongTrinh{

     public Phuongtrinhbac1() {
        bac = 1;
        nhapthamso = new NhapTuBanPhim();
        giaiphuongtrinh = new GiaiPTbac1();
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
