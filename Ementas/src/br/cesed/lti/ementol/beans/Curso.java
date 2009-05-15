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
public class Curso {

    private String nome;
    private List<Disciplina> listaDisciplina;
    private List<Professor> listaProfessores;
    private List<Aluno> listaAlunos;
    private Turno tipoTurno;
    private String semestre;
    private String nomeCoordenador;
    private int numPeriodos;

    public Curso(){
        listaDisciplina = new LinkedList<Disciplina>();
        listaProfessores = new LinkedList<Professor>();
    }

    public Curso(String nome,Turno tipoTurno, String semestre,String nomeCoordenador,int numPeriodos){
        listaDisciplina = new LinkedList<Disciplina>();
        listaProfessores = new LinkedList<Professor>();
        this.nome = nome;
        this.nomeCoordenador = nomeCoordenador;
        this.numPeriodos = numPeriodos;
        this.semestre = semestre;
        this.tipoTurno = tipoTurno;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(List<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCoordenador() {
        return nomeCoordenador;
    }

    public void setNomeCoordenador(String nomeCoordenador) {
        this.nomeCoordenador = nomeCoordenador;
    }

    public int getNumPeriodos() {
        return numPeriodos;
    }

    public void setNumPeriodos(int numPeriodos) {
        this.numPeriodos = numPeriodos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Turno getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(Turno tipoTurno) {
        this.tipoTurno = tipoTurno;
    }


   @Override
    public String toString(){
        String retorno = "\nNome curso: " + nome + "\nNome do Coordenador: " + nomeCoordenador + "\nSemestre: " + semestre + "\nNúmero de períodos: " + numPeriodos + "\nTurno: " + tipoTurno;
        return retorno;
    }
}
