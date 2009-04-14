package br.cesed.lti.ementol.actions;

import java.util.LinkedList;
import java.util.List;

import br.cesed.lti.ementol.Ementol;
import br.cesed.lti.ementol.actions.menu.MenuItem;
import br.cesed.lti.ementol.beans.Perfil;
import br.cesed.lti.ementol.beans.Usuario;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe Base da Hierarquia de Actions do Sistema CesuWeb.<br>
 * Sistema de Gerenciamento da Coordenação de Estágio Supervisionado.
 * @author Taciano Morais Silva
 * @version 10/02/2009, 16h52m
 * @since 22/09/2008, 16h00
 */
public class EmentolAction extends ActionSupport {

    /**
     * Número para serialização.
     */
    private static final long serialVersionUID = 162591378018984500L;

    /**
     * Resultado para a solicitação de inclusão.
     */
    public static final String SOLICITAR_INCLUSAO = "solicitarInclusao";

    /**
     * Resultado para a solicitação de alteração.
     */
    public static final String SOLICITAR_ALTERACAO = "solicitarAlteracao";

    /**
     * Fachada do Sistema.
     */
    private Ementol ementol = Ementol.getInstance();

    /**
     * Retorna a fachada do Sistema.
     * @return A fachada do Ementas On-line.
     */
    public Ementol getEmentol() {
        return ementol;
    }

    public List<MenuItem> createMenu(Usuario usuario) {
        List<MenuItem> menu = null;
        Integer perfil = usuario.getPerfil().getId();
        if (Perfil.ADMINISTRADOR.equals(perfil)) {
            menu = createMenuAdmin();
        }
        if (Perfil.CESU.equals(perfil) || Perfil.CESU_MONOGRAFIA.equals(perfil)
                || Perfil.CESU_ESTAGIO.equals(perfil)) {
            menu = createMenuCesu();
        }
        if (Perfil.COORDENADOR.equals(usuario.getPerfil().getId())) {
            menu = createMenuCoordenador();
        }
        if (Perfil.PROFESSOR.equals(usuario.getPerfil().getId())) {
            menu = createMenuProfessor();
        }
        return menu;
    }

    private List<MenuItem> createMenuAdmin() {
        List<MenuItem> menu = createMenuCesu();
        MenuItem item = new MenuItem("Usuario.action", getText("view.menu.listar.usuarios"));
        menu.add(item);
        item = new MenuItem("Perfil.action", getText("view.menu.listar.perfis"));
        menu.add(item);
        return menu;
    }

    private List<MenuItem> createMenuCesu() {
        List<MenuItem> menu = createMenuCoordenador();
        MenuItem item = new MenuItem("Monografia!solicitarRegistro.action", getText("view.menu.registro.monografia"));
        menu.add(1, item);
        item = new MenuItem("Estagio!solicitarRegistro.action", getText("view.menu.registro.estagio"));
        menu.add(2, item);
        item = new MenuItem("Curso.action", getText("view.menu.listar.cursos"));
        menu.add(item);
        return menu;
    }

    private List<MenuItem> createMenuCoordenador() {
        List<MenuItem> menu = createMenuProfessor();
        MenuItem item = new MenuItem("Empresa.action", getText("view.menu.listar.empresas"));
        menu.add(item);
        item = new MenuItem("Periodo.action", getText("view.menu.listar.periodos"));
        menu.add(item);
        item = new MenuItem("Professor.action", getText("view.menu.listar.professores"));
        menu.add(item);
        return menu;
    }

    private List<MenuItem> createMenuProfessor() {
        List<MenuItem> menu = new LinkedList<MenuItem>();
        MenuItem item = new MenuItem("Home.action", getText("view.menu.home"));
        menu.add(item);
        item = new MenuItem("Monografia.action", getText("view.menu.listar.monografias"));
        menu.add(item);
        item = new MenuItem("Estagio.action", getText("view.menu.listar.estagios"));
        menu.add(item);
        item = new MenuItem("LinhaPesquisa.action", getText("view.menu.listar.linhasPesquisa"));
        menu.add(item);
        item = new MenuItem("Aluno.action", getText("view.menu.listar.Aluno"));
        menu.add(item);
        return menu;
    }


    /**
     * Retorna o menu com as ações permitidas para o usuário.
     * @return O menu de ações.
     */
    public List<MenuItem> getMenu() {
        return getEmentol().getMenu();
    }
}
