/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3073;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Tectonia
 */
public class UTS_NO2_C_3073 {

    public static void main(String[] args) {
        SalariedEmployee_3073 se_3073 = new SalariedEmployee_3073();
        CommissionEmployee_3073 ce_3073 = new CommissionEmployee_3073();
        ProjectPlanner_3073 pp_3073 = new ProjectPlanner_3073();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama              : ");
            se_3073.Nama_3073 = br.readLine();
            System.out.print("NIP               : ");
            se_3073.NIP_3073 = br.readLine();
            System.out.print("Gaji Pokok        : ");
            se_3073.GajiPokok_3073 = Float.parseFloat(br.readLine());
            se_3073.TampilData_3073();
            
            System.out.print("Nama              : ");
            ce_3073.Nama_3073 = br.readLine();
            System.out.print("NIP               : ");
            ce_3073.NIP_3073 = br.readLine();
            System.out.print("GajiPokok         : ");
            ce_3073.GajiPokok_3073 = Float.parseFloat(br.readLine());
            System.out.print("Komisi            : ");
            ce_3073.Komisi_3073 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan   : ");
            ce_3073.TotalPenjualan_3073 = Float.parseFloat(br.readLine());
            ce_3073.TotalGaji_3073();
            ce_3073.TampilData_3073();
            
            System.out.print("Nama              : ");
            pp_3073.Nama_3073 = br.readLine();
            System.out.print("NIP               : ");
            pp_3073.NIP_3073 = br.readLine();
            System.out.print("Gaji Pokok        : ");
            pp_3073.GajiPokok_3073 = Float.parseFloat(br.readLine());
            System.out.print("Komisi            : ");
            pp_3073.Komisi_3073 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp_3073.TotalHslProyek_3073 = Float.parseFloat(br.readLine());
            pp_3073.TotalGaji_3073();
            pp_3073.TampilData_3073();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
