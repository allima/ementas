package br.cesed.lti.ementol.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ementa implements Bean, Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 9136646054422812959L;

	/**
     * Identificador do usuário.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * @return
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
