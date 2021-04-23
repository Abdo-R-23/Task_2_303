/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import authorizedbehaviour.AuthorizeBehaviour;
import printbehaviour.PrintBehaviour;
/**
 *
 * @author Abdelrahman
 */
public class pay_ment {
    private float amount ;
    private AuthorizeBehaviour authorizeBehaviour ;
    private PrintBehaviour printBehaviour ;

    public pay_ment( AuthorizeBehaviour authorizeBehaviour, PrintBehaviour printBehaviour) {
        this.authorizeBehaviour = authorizeBehaviour;
        this.printBehaviour = printBehaviour;
    }
    public void authoredbehaviour(){
    authorizeBehaviour.authorized();
    }
    public void printbehaviour(){
   printBehaviour.printRecpt();
    }

}