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
public class Professor extends Pessoa {

    private String cnt;
    private double salario;

    public Professor (){

    }

    public Professor (String nome, String cpf, String rg, GregorianCalendar dtNascimento){
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setDtNascimento(dtNascimento);
    }

    public Professor (String nome, String cpf, String rg, GregorianCalendar dtNascimento, String cnt, double salario){
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setDtNascimento(dtNascimento);
        this.salario = salario;
        this.cnt = cnt;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String retorno = "\nProfessor: "+ super.toString() +"\nCnt: "+ cnt + "\nSálario: "+ salario;
        return retorno;
    }


}
