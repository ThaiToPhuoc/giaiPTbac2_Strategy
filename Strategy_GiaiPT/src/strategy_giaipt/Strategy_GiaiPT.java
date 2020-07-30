/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_giaipt;

import Phuongtrinh.PhuongTrinh;
import Phuongtrinh.Phuongtrinhbac1;
import Phuongtrinh.Phuongtrinhbac2;

/**
 *
 * @author DELL
 */
public class Strategy_GiaiPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhuongTrinh ptbac1 = new Phuongtrinhbac1();
        ptbac1.nhapthamso();
        ptbac1.Giaiphuongtrinh();
        ptbac1.Xulyketqua();
        
        PhuongTrinh ptbac2 = new Phuongtrinhbac2();
        ptbac2.nhapthamso();
        ptbac2.Giaiphuongtrinh();
        ptbac2.Xulyketqua();
    }
    
}
