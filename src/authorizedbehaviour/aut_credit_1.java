/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authorizedbehaviour;

/**
 *
 * @author Abdelrahman
 */
public class aut_credit_1  implements AuthorizeBehaviour {
    @Override
    public void authorized() {
        System.out.print(" credit 1  statrgey"); 
    }
}
