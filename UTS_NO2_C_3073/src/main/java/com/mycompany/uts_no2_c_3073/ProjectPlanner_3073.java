/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3073;

/**
 *
 * @author Tectonia
 */
public class ProjectPlanner_3073 extends Employess_3073 {
    public float Komisi_3073;
    public float TotalHslProyek_3073;
    public double Totalgaji_3073;
    
    public ProjectPlanner_3073(){
        
    }
            
    public double TotalGaji_3073(){
        Totalgaji_3073 = GajiPokok_3073 + (Komisi_3073 * TotalHslProyek_3073) - (GajiPokok_3073 *5/100);
        return Totalgaji_3073;
    }
    
    public void TampilData_3073(){
        System.out.println("Project Plannner");
        Tampil_3073();
        System.out.println("Total Gaji: " + Totalgaji_3073);
    }
}
