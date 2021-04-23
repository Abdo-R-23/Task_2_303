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
public class cash extends pay_ment{
     private float cashtenderd ;

    public cash(AuthorizeBehaviour authorizeBehaviour, PrintBehaviour printBehaviour) {
        super(authorizeBehaviour, printBehaviour);
    }
    
}
