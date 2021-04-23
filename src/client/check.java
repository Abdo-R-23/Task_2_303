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
public class check extends pay_ment {
    private String name , bankID ; 

    public check(AuthorizeBehaviour authorizeBehaviour, PrintBehaviour printBehaviour) {
        super(authorizeBehaviour, printBehaviour);
    }

    
}
