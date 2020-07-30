/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xulyketqua;

import Phuongtrinh.PhuongTrinh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Ghivaofile implements IXuLyKetQua{
     private final String fileName;

    public Ghivaofile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void xuLy(PhuongTrinh pt) {
         try {
            FileWriter fileWriter =
                new FileWriter(fileName);

            BufferedWriter bufferedWriter;
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuilder b = new StringBuilder();
            if(pt.getNghiem().isEmpty())
            {
                b.append("Phương trình vô nghiệm!");
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
            
                    
            bufferedWriter.write(b.toString());

            bufferedWriter.close();
            File file = new File(fileName);
            System.out.println("Ghi file thành công!\nĐường dẫn: " + file.getAbsolutePath());
        }
        catch(IOException ex) {
            System.out.println(
                "Lỗi ghi file '"
                + fileName + "'");
        }
    }
    
}
