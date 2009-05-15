/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.cesed.lti.ementol.beans;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rodrigao
 */
public class Bibliografia {

        private String nome;
        private int id;
        private String tipoBibliografia;
        private List<Livro> listaLivro;

        private Bibliografia(){
            listaLivro = new LinkedList<Livro>();
        }

        private Bibliografia(String nome, int id, String tipoBibliografia){
            this.nome = nome;
            this.id = id;
            this.tipoBibliografia =tipoBibliografia;
            listaLivro = new LinkedList<Livro>();

        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Livro> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(List<Livro> listaLivro) {
        this.listaLivro = listaLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoBibliografia() {
        return tipoBibliografia;
    }

    public void setTipoBibliografia(String tipoBibliografia) {
        this.tipoBibliografia = tipoBibliografia;
    }

    @Override
    public String toString() {
        String retorno = "\nNome: "+nome+"\nId: "+id+"\nTipo bibliografia: "+tipoBibliografia+"\n";
        return retorno;
    }

}
