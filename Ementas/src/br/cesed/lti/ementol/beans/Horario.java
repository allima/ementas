/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.cesed.lti.ementol.beans;

/**
 *
 * @author rodrigao
 */
public class Horario {

    private DiaDaSemana dia;
    private String horarioInicio;
    private String horarioTermino;

    public Horario(){

    }

    public Horario(DiaDaSemana dia, String horarioInicio, String horarioTermino){
        this.dia = dia;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    public DiaDaSemana getDia() {
        return dia;
    }

    public void setDia(DiaDaSemana dia) {
        this.dia = dia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    @Override
    public String toString() {
        String retorno = "\nDia da semana: "+dia+"\nHorario inicio: "+horarioInicio+"\nHorario termino: "+horarioTermino+"\n";
        return retorno;


    }


}
