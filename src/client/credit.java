/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import authorizedbehaviour.AuthorizeBehaviour;
import java.util.Date;
import printbehaviour.PrintBehaviour;
/**
 *
 * @author Abdelrahman
 */
public class credit  extends pay_ment{
      private String name, type ;
    private Date expDate ;

    public credit(AuthorizeBehaviour authorizeBehaviour, PrintBehaviour printBehaviour) {
        super(authorizeBehaviour, printBehaviour);
    }
    
}
