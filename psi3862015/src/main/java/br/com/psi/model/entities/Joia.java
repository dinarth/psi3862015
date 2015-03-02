package br.com.psi.model.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="joia")
public class Joia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="id_Joia", nullable = false)
    private Integer idJoia;
    @Column(name="nu_Lote", nullable = false)
    private Integer nuLote;
    @Column(name="nu_Item", nullable = false)
    private Integer nuItem;
    @Column(name="nu_Peso", nullable = false)
    private Integer nuPeso;
    @Column(name="nu_Valor", nullable = false)
    private Integer nuValor;
    @Column(name="ds_Descricao", nullable = false)
    private String dsDescricao;
    @Column(name="ds_Observacao", nullable = false)
    private String dsObservacao;

    
    @ManyToOne(optional = false)
    @ForeignKey(name = "FK_Joia_TipoObjeto")
    @Column(name="ds", nullable = false)
    private Joia joia;
    
    
    
    
    
    
    public Joia(){
    }
    
    
    public Integer getIdJoia() {
        return idJoia;
    }

    public void setIdJoia(Integer idJoia) {
        this.idJoia = idJoia;
    }

    public Integer getNuLote() {
        return nuLote;
    }

    public void setNuLote(Integer nuLote) {
        this.nuLote = nuLote;
    }

    public Integer getNuItem() {
        return nuItem;
    }

    public void setNuItem(Integer nuItem) {
        this.nuItem = nuItem;
    }

    public Integer getNuPeso() {
        return nuPeso;
    }

    public void setNuPeso(Integer nuPeso) {
        this.nuPeso = nuPeso;
    }

    public Integer getNuValor() {
        return nuValor;
    }

    public void setNuValor(Integer nuValor) {
        this.nuValor = nuValor;
    }

    public String getDsDescricao() {
        return dsDescricao;
    }

    public void setDsDescricao(String dsDescricao) {
        this.dsDescricao = dsDescricao;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idJoia);
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
        final Joia other = (Joia) obj;
        if (!Objects.equals(this.idJoia, other.idJoia)) {
            return false;
        }
        return true;
    }
    
    
    

    

    
    
}
