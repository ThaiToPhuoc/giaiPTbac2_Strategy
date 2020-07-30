/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhapthamso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhapTuFile implements INhapthamso{
private String fileName;

    public NhapTuFile(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public List<Integer> nhapThamSo(int bac) {
        try {
            List<Integer> thamso = new ArrayList<>();
            int i = 0;
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              thamso.add(myReader.nextInt());
              i+=1;
            }
            myReader.close();
            return thamso;
        }
        catch (FileNotFoundException e) {
            System.out.println("Đã có lỗi xảy ra");
            return new ArrayList<>();
        }
    }
}
