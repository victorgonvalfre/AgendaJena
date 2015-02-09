/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda.utils;

import java.util.ArrayList;
import java.util.List;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 *
 * @author Jair
 */
public class GeradorDeUsuarios {
    
    
    public List<Usuarios> gerarUsuarios(int quantidade){
        DataFactory df = new DataFactory();
        List<Usuarios> lstUsers = new ArrayList<Usuarios>();
        Usuarios user;
        
        while(quantidade > 0){
            user = new Usuarios();
            user.nome = df.getFirstName() + " " + df.getLastName();
            user.email = df.getEmailAddress();
            user.telefone = df.getNumberText(8);
            user.endereco = df.getAddress();
      
            lstUsers.add(user);
            quantidade --;
        }

        return lstUsers;
    }
    
   
    
}
