/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xulyketqua;

import Phuongtrinh.PhuongTrinh;

/**
 *
 * @author DELL
 */
public class Xuatramanhinh implements IXuLyKetQua{

    @Override
    public void xuLy(PhuongTrinh pt) {
         StringBuilder b = new StringBuilder();
            if(pt.getNghiem().isEmpty())
            {
                b.append("\n Phương trình vô nghiệm!");
            }
            else
            {
                b.append("\nNghiệm của phương trình bậc ")
                    .append(pt.getBac())
                    .append(" là:\n");
                for(int i = 0; i < pt.getNghiem().size(); i++)
                {
                    b.append(pt.getNghiem().get(i)).append("\n");
                }
            }
            
            System.out.println(b);
    }
    
}
