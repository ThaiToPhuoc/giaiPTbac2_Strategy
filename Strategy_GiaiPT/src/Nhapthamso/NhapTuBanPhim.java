/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nhapthamso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhapTuBanPhim implements INhapthamso{

    @Override
    public List<Integer> nhapThamSo(int bac) {
        List<Integer> thamso = new ArrayList<>();
        if(bac == 1)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập a: ");
            thamso.add(scanner.nextInt());
            System.out.print("Nhập b: ");
            thamso.add(scanner.nextInt());
        }
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập a: ");
            thamso.add(scanner.nextInt());
            System.out.print("Nhập b: ");
            thamso.add(scanner.nextInt());
            System.out.print("Nhập c: ");
            thamso.add(scanner.nextInt());
        }
        return thamso;
    }
    
}
