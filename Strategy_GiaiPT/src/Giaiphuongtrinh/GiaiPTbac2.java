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
public class GiaiPTbac2 implements IGiaiPhuongTrinh{

    @Override
    public List<Double> giaipt(List<Integer> thamso) {
        List<Double> nghiem = new ArrayList<>();
        
        double delta = thamso.get(1) * thamso.get(1) + 4*thamso.get(0)*thamso.get(2);
        if(delta < 0)
            return nghiem;
        else
        {
            if(delta == 0)
            {
                double x = - thamso.get(1) / (2 * thamso.get(0));
                nghiem.add(x);
                return nghiem;
            }
            else
            {
                double x = (-thamso.get(1) + Math.sqrt(delta))/(2*thamso.get(0));
                nghiem.add(x);
                x = (-thamso.get(1) - Math.sqrt(delta))/(2*thamso.get(0));
                nghiem.add(x);
                return nghiem;
            }
        }
    }
    
}
