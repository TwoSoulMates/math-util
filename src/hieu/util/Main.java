/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieu.util;

/**
 *
 * @author lmh73
 */
public class Main {
    public static void main(String[] args) {
        // ki thuat test can ban: nhin bang mat cac test cases de ket luan ham
        // dung sai
        long expected= 120;
        long actual= MathUtility.getFactorial(5);
        // ki vong 120, chay thuc te ra gi luu o factual
        // so sanh= mat
        System.out.println("5! ? expected: " + expected + "; actual: " + actual);
        
        System.out.println("6! ? expected: 720; actual: " + MathUtility.getFactorial(6));
        System.out.println("0! ? expected: 1; actual: " + MathUtility.getFactorial(0));
        // ki vong nem ve ngoai le neu dua am giai thua
        MathUtility.getFactorial(-5);
        // khong can sout() vi chet ngay khi goi ham
        // xai ham khong dung cach    
        
        // nhuoc diem 
        // can dung mat so sanh tung ttruong hop so sanh ham: expected vs actual 
        // nhieu tinh huong, mat met moi vi  phai do tung output
        
        // cach nang cao
        // gom cac cases nay lai, chay 1 luot nhu tren 
        // may so expected va actual
        // sau do 
        // nau tat ca cases dung thay ra mau xanh
        // nau tat ca cac cases deu dung, ngoai tru 1,2 truong hop 
        // expected khac actual, thay ra mau do ham sai
        // ham dung gan het ma sai mot vai, ham khong tin cay
        // chi co duy nhat 1 cap expected actual khong bang nhau, ket luan ham sai
        // thay vi nhin tung case, nhin mau xanh hoac do
        // bo thu vien lam 2 viec: so sanh expected vs actual
        // khop thi thay ra may xanh, sai thi thay ra mau do
        // thu vien thu quet het case minh thiet ke de dua ra ket luan, mat chi nhin duy nhat mot mau la du
        // bo thu vien la cac fie .JAR .DLL duoc the vao project
        // bo thu vien nay mang cai ten cho moi ngon ngu lap trinh - Unit Test
        // rieng cho Java: Junit, TestNG
        //           C#: NUnit
        // ....
        // dua code len server
    }
}
