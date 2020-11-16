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
public class MathUtility {
    // fake class Math giong nhu that 
    // Math.sqrt() .abs() .pow() .sin() .PI
    public static final double PI= 3.1415; // xai MathUtillity.PI
    // tinh n!= 1.2.3.4...n
    // 0!= 1!;
    // bai nay chi tinh giai thua trong khoang 0 den 20
    // neu dua n <0 hoac n> 20 ko tinh  
    public static long getFactorial(int n) {
        if (n<0 || n>20) 
            throw new IllegalArgumentException("n must be between 0..20");
        else if (n==0 || n==1)
            return 1;
        // CPU chay lenh cho nay tuc la n= 2..20, khong xai else
        long result= 1;
        for (int i= 2; i<= n; i++) 
            result *=i;
        return result; 
        // test ket qua ham tra ve EXPECTED VALUE
        // goi xem no chay ra bao nhieu ACTUAL VALUE
        // so sanh ACTUAL VALUE==EXPECTED VALUE hay ko 
        // co , ham chay dung trong tinh huong X
        // khong, ham chay sai trog tinh huong X
        // goi ham getFactorial(5), cho ra ket qua (actual)
        // neu actual gia su la 120 luon, ham dung cho 5! vi khop ki vong 
        // case(tinh huong) n= 5 ham dung 
        // case             n= 6 ham tra ve 720 thi ham dung
        // case             n= 0 ham tra ve 1 thi ham dung
        // lam cac case ma minh nghi nguoi dung xai goi la test cases
        // mot ham co nhieu test cases voi nhieu tinh huong 
    }
}
