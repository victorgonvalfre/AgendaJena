/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda.app;

import Agenda.utils.GeradorDeUsuarios;
import Agenda.utils.GeradorRdf;
import Agenda.utils.Usuarios;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jair
 */
public class AgendaApp {
    Scanner scanner = new Scanner(System.in);
    
    
    
    public void start() throws IOException{
        GeradorDeUsuarios gerador = new GeradorDeUsuarios();
        List<Usuarios> lstUsers = new ArrayList<Usuarios>();
        
        System.out.println("Bem Vindo ao Agenda Jena Vix!");
        System.out.println("Quantos Usuarios Deseja criar?");
        int quantUsuarios = Integer.parseInt(scanner.nextLine());
        
        lstUsers = gerador.gerarUsuarios(quantUsuarios);
        
        
        for(Usuarios users: lstUsers){
            System.out.println(users.toString());
        }
        GeradorRdf rdfGerador = new GeradorRdf();
        rdfGerador.gerarRdf(lstUsers);
    }
    
}
