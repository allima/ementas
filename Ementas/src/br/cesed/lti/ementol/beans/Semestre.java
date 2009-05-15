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
public class Semestre {

    private GregorianCalendar dtInicio = new GregorianCalendar();
    private GregorianCalendar dtFim = new GregorianCalendar();

    public Semestre(){

    }

    public Semestre(GregorianCalendar dtInicio, GregorianCalendar dtFim){
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    public GregorianCalendar getDtFim() {
        return dtFim;
    }

    public void setDtFim(GregorianCalendar dtFim) {
        this.dtFim = dtFim;
    }

    public GregorianCalendar getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(GregorianCalendar dtInicio) {
        this.dtInicio = dtInicio;
    }

    @Override
    public String toString(){
        String retorno = "\nData inicio: "+ dtInicio + "\nData fim: "+ dtFim +"\n";
        return retorno;
    }

}
