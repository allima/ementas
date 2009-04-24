package br.cesed.lti.ementol.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ementa")
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

    @Column(name = "descricao")
    private String descricao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
