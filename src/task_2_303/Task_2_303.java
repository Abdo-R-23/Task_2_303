package task_2_303;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import client.pay_ment;
import authorizedbehaviour.aut_credit_2;
import printbehaviour.print__non;

/**
 *
 * @author Abdelrahman
 */
public class Task_2_303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pay_ment p = new pay_ment(new aut_credit_2(), new print__non() );
        p.authoredbehaviour();
        System.out.print(" \n\n\n");
        p.printbehaviour();
        
    
    }
    
}
