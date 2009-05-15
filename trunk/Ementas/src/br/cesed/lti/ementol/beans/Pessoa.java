/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.cesed.lti.ementol.beans;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rodrigao
 */
abstract class Pessoa {

    private String nome;
    private List<Telefone> listaTelefones ;
    private String rg;
    private String cpf;
    private GregorianCalendar dtNascimento;

    public Pessoa(){
        listaTelefones = new LinkedList<Telefone>();
    }

    public Pessoa(String nome, String cpf){
        listaTelefones = new LinkedList<Telefone>();
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf,String rg,GregorianCalendar dtNascimento){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        listaTelefones = new LinkedList<Telefone>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public GregorianCalendar getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(GregorianCalendar dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
//duvida de como fazer o set e o get de um telefone, onde devo criar um lista de telefones
   

    @Override
    public String toString() {
        String retorno = "\nNome: "+ nome +"\nRG: "+ rg +"\nCpf: "+ cpf +"Data de Nascimento: "+ dtNascimento;
        return retorno;
    }


}
