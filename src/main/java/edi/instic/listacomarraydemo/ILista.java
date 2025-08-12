/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edi.instic.listacomarraydemo;

/**
 *
 * @author D.N.Kasso
 * @param <T>
 */
public interface ILista <T>{
   
    public int extensao();
    public T obter(int pos) throws Exception;
    public boolean vazio();
    public void adicionar(T novo);
    public void adicionar(T novo, int pos) throws Exception;
    public int procurar(T dado);
    public T extrair(int pos) throws Exception;
}
