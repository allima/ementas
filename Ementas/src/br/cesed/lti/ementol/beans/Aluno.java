/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.cesed.lti.ementol.beans;

import java.util.GregorianCalendar;

/**
 *
 * @author rodrigao
 */
public class Aluno extends Pessoa{

    private String matricula;

    public Aluno(){

    }

    public Aluno(String nome, String cpf, String rg, GregorianCalendar dtNascimento){
        setCpf(cpf);
        setDtNascimento(dtNascimento);
        setRg(rg);
        setDtNascimento(dtNascimento);
    }

    public Aluno(String nome, String cpf, String rg, GregorianCalendar dtNascimento, String matricula){
        setCpf(cpf);
        setDtNascimento(dtNascimento);
        setRg(rg);
        setDtNascimento(dtNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String retorno = "\nAluno: "+ super.toString() +"\nMatrícula: "+ matricula;
        return retorno;
    }
    

}
