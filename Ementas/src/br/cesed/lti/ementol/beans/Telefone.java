/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.cesed.lti.ementol.beans;

/**
 *
 * @author rodrigao
 */
public class Telefone {

    private String numero;
    private TipoTelefone tipo;


    public Telefone(){

    }

    public Telefone(String numero , TipoTelefone tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    @Override
   public String toString(){
       String retorno = "\nNúmero do telefone: "+ numero +"\nTipo do telefone: "+ tipo;
       return retorno;
   }
}
