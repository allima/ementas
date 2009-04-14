package br.cesed.lti.ementol.actions.menu;

/**
 * Classe utilitária para a criação do menu.
 * @author Taciano Morais Silva
 * @version 10/02/2009, 15h55m
 * @since 10/02/2009, 15h55m
 */
public class MenuItem {

    private String action;

    private String name;

    public MenuItem(String action, String name) {
        this.action = action;
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
