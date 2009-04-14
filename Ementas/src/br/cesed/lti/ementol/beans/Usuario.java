package br.cesed.lti.ementol.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe que representa a entidade usuário do sistema CesuWeb.
 * @author Taciano Morais Silva
 * @version 15/10/2008
 * @since 15/10/2008
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Bean, Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 6687649756722994115L;

    /**
     * Identificador do usuário.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * Nome do usuário.
     */
    @Column(name = "nome")
    private String nome;

    /**
     * Login do usuário.
     */
    @Column(name = "login")
    private String login;

    /**
     * Senha do usuário.
     */
    @Column(name = "senha")
    private String senha;

    @Column(name="email", length = 60, nullable = false)
    private String email;

    /**
     * Perfil do usuário.
     */
    @ManyToOne
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;

    /**
     * Construtor default.
     */
    public Usuario() {
    }

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

    /**
     * Retorna o login do usuário.
     * @return O login do usuário.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Modifica o login do usuário.
     * @param login O novo login do usuário.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retorna o nome do usuário.
     * @return O nome do usuário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do usuário.
     * @param nome O novo nome do usuário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o perfil do usuário.
     * @return O perfil do usuário.
     */
    public Perfil getPerfil() {
        return perfil;
    }

    /**
     * Modifica o perfil do usuário.
     * @param perfil O novo perfil do usuário.
     */
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    /**
     * Retorna a senha do usuário.
     * @return A senha do usuário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Modifica a senha do usuário.
     * @param senha A nova senha do usuário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
