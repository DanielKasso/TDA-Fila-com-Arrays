/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edi.instic.listacomarraydemo;

/**
 *
 * @author D.N.Kasso
 */
public class ListaComArrayDemo {

    public static void main(String[] args) throws Exception {
        
        ListaArrayEstatico<String> nomes = new ListaArrayEstatico<>();
      
        System.out.println("Tamanho da lista: " + nomes.extensao());
        nomes.adicionar("Daniel");
        nomes.adicionar("Kasso");
        nomes.adicionar("Pedro");
        nomes.adicionar("Neves");
        nomes.adicionar("Joao");
        nomes.adicionar("Elisa",1);
        nomes.adicionar("Nvula");
        
        System.out.println(".................................................");
        System.out.println("Tamanho da lista: " + nomes.extensao());
            
        for (int i = 0; i < nomes.extensao(); i++) {
            System.out.println(( i + 1 ) + ".Nome: " + nomes.obter(i));
            System.out.println("");
        }
        System.out.println("Extraido: " + nomes.extrair(5));
        System.out.println("................................................");
        for (int i = 0; i < nomes.extensao(); i++) {
            System.out.println(( i + 1 ) + ".Nome: " + nomes.obter(i));
            System.out.println("");
        }
        System.out.println(".........................");
        System.out.println("Tamanho da lista: " + nomes.extensao());
        System.out.println("Procurar: " + nomes.procurar("Neves"));

        
    }

}
