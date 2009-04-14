package br.cesed.lti.ementol.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe que representa a entidade usuário do sistema CesuWeb.
 * @author Taciano Morais Silva
 */
@Entity
@Table(name = "perfil")
public class Perfil implements Bean, Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 60318054752639052L;

    public static final Integer ADMINISTRADOR = 10;
    public static final Integer CESU = 20;
    public static final Integer CESU_MONOGRAFIA = 30;
    public static final Integer CESU_ESTAGIO = 40;
    public static final Integer COORDENADOR = 50;
    public static final Integer PROFESSOR = 60;

    /**
     * Identificador do perfil.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * Nome do perfil.
     */
    @Column(name = "nome")
    private String nome;

    /**
     * Descrição do perfil.
     */
    @Column(name = "descricao")
    private String descricao;

    public Perfil () {
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao (String val) {
        this.descricao = val;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String val) {
        this.nome = val;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
