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
public class Disciplina {

    private String nome;
    private String cargaHoraria;
    private String nomeDoProfessor;
    private int id;
    private List<Aluno> listaAluno;

    public Disciplina(){
        listaAluno = new LinkedList<Aluno>();
    }

    public Disciplina(String nome,String cargaHorarias,String nomeDoProfessor,int id){
        listaAluno = new LinkedList<Aluno>();
        this.cargaHoraria = cargaHorarias;
        this.nome = nome;
        this.nomeDoProfessor = nomeDoProfessor;
        this.id = id;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    @Override
    public String toString(){
        String retorno = "\nNome da disciplina: "+ nome +"\nNome do professor: "+ nomeDoProfessor + "\nId: " + id + "\nCarga horária: "+ cargaHoraria;
        return retorno;
    }

}
