/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3073;

/**
 *
 * @author Tectonia
 */
public class CommissionEmployee_3073 extends Employess_3073 {
    public float Komisi_3073;
    public float TotalPenjualan_3073;
    public float Totalgaji_3073;
    
    public CommissionEmployee_3073(){
        
    }
    
    public float TotalGaji_3073(){
        Totalgaji_3073 = GajiPokok_3073 + (Komisi_3073 * TotalPenjualan_3073);
        return Totalgaji_3073;
    }
    
    public void TampilData_3073(){
        System.out.println("Commission Employee");
        Tampil_3073();
        System.out.println("Total Gaji: " + Totalgaji_3073);
    }
}
