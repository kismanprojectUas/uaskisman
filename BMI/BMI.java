/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author KISMAN
 */
public class BMI {
    // Atribut yang saya gunakan adalah double karena nanti hasilnya bilangan desimal 
    double height; // tinggi dalam cm
    double weight; // berat dalam kg
    
    // Constructornya adalah berat sama tinggi
    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
        System.out.println("tinggi saya " +height);
        System.out.println("berat badan saya " +weight);
    }

    // Method yang saya gunakan untuk menghitung BMI 
    public double calculateBMI() {
        // Menghitung BMI (berat(kg) dibagi tinggi dalam meter kuadrat)
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
        
    }

    // Method yang saya gunakan untuk menampilkan status BMI adalah getBMIStatus
    public String getBMIStatus() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "kurus";
        } 
        if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } 
        if (bmi >= 25 && bmi < 29.9) {
            return "Gemuk";
        } 
        else {
            return "Obesitas";
       } 
        
    }
}



