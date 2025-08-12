/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edi.instic.listacomarraydemo;

/**
 * V
 * @author D.N.Kasso
 * @param <T>
 */
//Veja que a unica diferenca esta nos metodos adicionar e o metodo especifico acrescentar

public class ListaArrayDinamico <T> implements ILista<T>{
    private T[] elementos;
    private int tamanho;

    public ListaArrayDinamico() {
        this.elementos = (T[])new Object[200];
        this.tamanho = 0;
    }
    
    public ListaArrayDinamico(int tamanho) {
        this.elementos = (T[])new Object[tamanho];
        this.tamanho = 0;
    }
    
    public T[] getElementos() {
        return elementos;
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }
    
    @Override
    public int extensao(){
        return this.tamanho;
    }
        
    @Override
    public T obter(int pos) throws Exception{
        if(pos >= 0 && pos < tamanho)
            return this.elementos[pos];
        else 
            throw new Exception("Posicao invalida");
    }

    @Override
    public boolean vazio() {
        return tamanho == 0;
    }

    @Override
    public void adicionar(T novo) {
        if(tamanho==elementos.length)
            acrecentar();
        elementos[tamanho]=novo;
        tamanho++; 
    }

    @Override
    public void adicionar(T novo, int pos) throws Exception {
        if(pos >=0 && pos < tamanho)
        {
           if(tamanho==elementos.length)
              acrecentar();
           for (int i = tamanho - 1; i >= pos; i--) 
               elementos[i + 1] = elementos[i];
           elementos[pos] = novo;
           tamanho++;
        }
        else
           throw new Exception("Posicao invalida"); 
    }

    @Override
    public int procurar(T dado) {
        for (int i = 0; i < tamanho; i++) 
            if(elementos[i].equals(dado))
                return i;
        return -1;
    }

    @Override
    public T extrair(int pos) throws Exception {
        T elemento = elementos[pos];
        if(pos >= 0 && pos < tamanho){
            for (int i = pos; i < tamanho; i++) {
                elementos[ i ] = elementos[ i + 1 ];
            }
            tamanho--;
            return elemento;
        }
        throw new Exception("Posicao invalida");
    }
    
    private void acrecentar ()
    {
        T[] aumento= (T[])new Object[elementos.length * 2];
        for (int i = 0; i < tamanho; i++) 
            aumento[i] = elementos[i];   
        elementos = aumento;
    }
    
}
