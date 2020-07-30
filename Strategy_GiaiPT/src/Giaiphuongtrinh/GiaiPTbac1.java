/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giaiphuongtrinh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class GiaiPTbac1 implements IGiaiPhuongTrinh{

    @Override
    public List<Double> giaipt(List<Integer> thamso) {
        List<Double> nghiem = new ArrayList<>();
        if(thamso.get(0) == 0)
            return nghiem;
        else
        {
            double x = -thamso.get(1)/thamso.get(0);
            nghiem.add(x);
            return nghiem;
        }
    }
    
}
