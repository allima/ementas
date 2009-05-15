/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.cesed.lti.ementol.beans;

/**
 *
 * @author rodrigao
 */
class Livro {

    private String titulo;
    private String isbn;
    private String nomeDoAutor;
    private String nomeEditora;
    private String edicao;

    public Livro(){

    }

    public Livro( String titulo, String isbn, String nomeDoAutor, String nomeEditora, String edicao){
       this.titulo = titulo;
       this.isbn = isbn;
       this.nomeDoAutor = nomeDoAutor;
       this.nomeEditora = nomeEditora;
       this.edicao = edicao;

    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        String retorno = "\nTitulo: "+titulo+"\nISBN: "+isbn+"\nNome do autor: "+nomeDoAutor+"\nNome da editora: "+nomeEditora+"\nEdição: "+edicao;
        return retorno;
    }




}
