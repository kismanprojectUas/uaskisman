/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author KISMAN
 */
public class BMIBERAKSI {
        public static void main(String[] args) {
        // tinggi dan berat
        BMI bmi = new BMI(168, 68);
        
        // Menghitung dan menampilkan hasil BMI
        double result = bmi.calculateBMI();
        System.out.println("BMI: " + result);
        System.out.println("Status: " + bmi.getBMIStatus());
    }
}
