/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda.app;

import Agenda.utils.AbstractQuery;
import Agenda.utils.SparqlUtil;
import java.util.Scanner;

/**
 *
 * @author Jair
 */
public class AgendaSearch extends AbstractQuery{

    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            SparqlUtil sparql = new SparqlUtil();
            int aux = 0;
            String query = "SELECT ?x ?given WHERE {?x  <http://www.w3.org/2001/vcard-rdf/3.0#N>  ?given}";
            
            
            String paramPesquisa = "";
            String modoPesquisa = "";
        
            System.out.println("Bem Vindo a Pesquisa de Usuarios da Agenda Jena Vix!");
            
                 System.out.println("Para pesquisar um usuario por nome digite 1, por email 2, para sair qualquer outro numero!");
                 aux = Integer.parseInt(scanner.nextLine());
                 
                 switch(aux){
                    case 1:  
                        System.out.println("Digite o nome para a pesquisa!");
                        paramPesquisa = scanner.nextLine();
                        modoPesquisa = "name";
                        break;
                    case 2:
                        System.out.println("Digite o email para a pesquisa!");
                        paramPesquisa = scanner.nextLine();
                        modoPesquisa = "email";
                        break;
                    default:
                        System.out.println("Pesquisa Finalizada!");
                 }
		
		
                System.out.println("Você pesquisou por : " + modoPesquisa + " Com o valor : " + paramPesquisa);
		sparql.printQueryParameterizedString(query, inputFileName, modoPesquisa, paramPesquisa);
		sparql.printQueryMAP(query, inputFileName, modoPesquisa, paramPesquisa);
				

	}


    
}
