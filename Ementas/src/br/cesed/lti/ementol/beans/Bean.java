package br.cesed.lti.ementol.beans;

import java.io.Serializable;

/**
 * @author Taciano Morais Silva
 * @version 15/10/2008
 * @since 15/10/2008
 */
public interface Bean extends Serializable {
    
    /**
     * Retorna o identificador do bean.
     * @return O identificador do bean.
     */
    public Integer getId();

    /**
     * Modifica o identificador do bean.
     * @param id O novo identificador do bean.
     */
    public void setId(Integer id);

}
