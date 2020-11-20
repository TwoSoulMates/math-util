/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieu.util;

import static hieu.util.MathUtility.*;
// chi co tu JDK 5, chi danh cho static 
// tuc la import static thi moi ham trong class nay khi goi thi khong can ten clss cham, goi nhu C va hieu ngam la da cham roi 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lmh73
 */
public class MathUtilityTest {
    public MathUtilityTest() {
    }
    // class nay la class xai JUnit de test code theo dang xanh do thay vi nhin bang mat nhu ben main(), sout()
    // 2 file .JAR da duoc add vao project va ta thoai mai xai cac ham cua no 
    // trong cac ham cua thu vien nay co nhung ham dac biet co ten xuat phat la assertX(expected va actual dua vao)
    // neu thay expected khong bang actual, thay mau do 
    // nguoc lai, neu thay expected bang actual, thay mau xanh
    // quy tac xanh do: neu tat ca mau xanh -> ket luan xanh
    // neu co it nhat mot mau do, khong quan tam cac ket qua con lai -> ket luan do
    // dam bao ham chay dung moi cases, truong hop 
    
    @Test // bien ham ngay sau day thanh public void main()
    // muon chay thi nhan SHIFT + F6
        public void getFactorial_RunsWell_IfValidArgument() {
            assertEquals(120, getFactorial(5));
            assertEquals(720, getFactorial(6));
            assertEquals(24, getFactorial(4));
            assertEquals(6, getFactorial(3));
            assertEquals(1, getFactorial(0));
        }
    @Test (expected= IllegalArgumentException.class)
        public void getFactorial_ThrowsException_IfInvalidArgument() {
            // ngoai le khong phai value de assert()
            // chi co the chup lai
            getFactorial(-5);
        }
}
