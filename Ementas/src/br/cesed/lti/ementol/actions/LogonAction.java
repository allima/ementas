package br.cesed.lti.ementol.actions;

import java.util.logging.Level;

import org.apache.log4j.Logger;

import br.cesed.lti.ementol.EmentolException;
import br.cesed.lti.ementol.beans.Periodo;
import br.cesed.lti.ementol.beans.Usuario;

/**
 * Classe Action responsável pelo login no sistema.
 * @author taciano
 * @version v-0.1 - 19/09/2008
 * @since 19/09/2008
 */
public class LogonAction extends EmentolAction {

    /**
     * Número para serialização.
     */
    private static final long serialVersionUID = 832724798067305294L;

    /**
     * Logger da Classe.
     */
    private Logger logger = Logger.getLogger(LogonAction.class);

    /**
     * Login do usuário.
     */
    private String username;

    /**
     * Senha do usuário.
     */
    private String password;

    /**
     * Período ativo (Período atual).
     */
    private Periodo periodo;

    /**
     * Verifica a entrada do formulário de login e encaminha para a página
     * principal se não houver erro.
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() {

        Usuario usuario = null;

        if (!isInvalid(getUsername()) && !isInvalid(getPassword())) {
            try {
                usuario = getEmentol().autenticarUsuario(getUsername(), getPassword());
            } catch (EmentolException e) {
                java.util.logging.Logger.getLogger(LogonAction.class.getName()).log(Level.SEVERE, e.getMessage(), e);
                addActionError(e.getMessage());
            }
        }

        getEmentol().setUsuarioSessao(usuario);

        if (usuario == null) {
            addFieldError("username", getText("view.usuario.invalidos"));
            return INPUT;
        }

        getEmentol().setMenu(createMenu(usuario));

        try {
            logger.info("execute()");
            setPeriodo(getEmentol().getPeriodoAtivo());
        } catch (EmentolException ex) {
            java.util.logging.Logger.getLogger(LogonAction.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            addActionError(ex.getMessage());
        }
        return SUCCESS;
    }

    public String sair() {
        logger.info("sair()");
        getEmentol().setUsuarioSessao(null);
        getEmentol().setMenu(null);
        return INPUT;
    }

    /**
     * @param value
     * @return
     */
    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retorna o período ativo.
     * @return O período ativo.
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * Modifica o período.
     * @param periodo O novo período.
     */
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
}
