package br.cesed.lti.ementol;

import java.util.List;

import br.cesed.lti.ementol.actions.menu.MenuItem;
import br.cesed.lti.ementol.beans.Periodo;
import br.cesed.lti.ementol.beans.Usuario;

/**
 * Classe fachada do sistema de ementas on-line.
 * @author Taciano Morais Silva
 * @version 08/04/2009, 20h12m
 * @since 08/04/2009, 20h12m
 */
public class Ementol {

	/**
     * Instância única da fachada AvaliaCesed.
     */
    private static Ementol instance;

    /**
     * Construtor privado do AvaliaCesed.
     */
    private Ementol() {
    }

    /**
     * Retorna a instância única do singleton AvaliaCesed (fachada).
     * @return A instância do AvaliaCesed.
     */
    public static Ementol getInstance() {
        if (instance == null) {
            synchronized(Ementol.class) {
                Ementol inst = instance;
                if (inst == null) {
                    synchronized(Ementol.class) {
                    instance = new Ementol();
                    }
                }
            }
        }
        return instance;
    }

	public List<MenuItem> getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario autenticarUsuario(String username, String password) throws EmentolException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUsuarioSessao(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	public void setMenu(List<MenuItem> createMenu) {
		// TODO Auto-generated method stub

	}

	public Periodo getPeriodoAtivo() throws EmentolException {
		// TODO Auto-generated method stub
		return null;
	}


}
