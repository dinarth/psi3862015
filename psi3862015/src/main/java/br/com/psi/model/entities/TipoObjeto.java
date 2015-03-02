package br.com.psi.model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="tipoObjeto")
public class TipoObjeto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="id_TipoObjeto", nullable=false)
    private Integer idTipoObjeto;
    @Column(name="ds_Tipo")
    private String dsTipo;

    @OneToMany(mappedBy = "tipoObjeto", fetch = FetchType.LAZY)
    @ForeignKey(name = "FK_Joia_TipoObjeto")
    private List<Joia> joia;
 
    public TipoObjeto(){}
    
    public Integer getIdTipoObjeto() {
        return idTipoObjeto;
    }

    public void setIdTipoObjeto(Integer idTipoObjeto) {
        this.idTipoObjeto = idTipoObjeto;
    }

    public String getDsTipo() {
        return dsTipo;
    }

    public void setDsTipo(String dsTipo) {
        this.dsTipo = dsTipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.idTipoObjeto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoObjeto other = (TipoObjeto) obj;
        if (!Objects.equals(this.idTipoObjeto, other.idTipoObjeto)) {
            return false;
        }
        return true;
    }
    
    
    
}
