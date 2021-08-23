package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PCA_SUBTIPOADIANTAMENTO
* @generated
*/
@Entity
@Table(name = "\"PCA_SUBTIPOADIANTAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PCA_SUBTIPOADIANTAMENTO")
public class PCA_SUBTIPOADIANTAMENTO implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ID_SUBTIPOADIANTAMENTO", nullable = false, insertable=true, updatable=true)
        private java.lang.String id_SUBTIPOADIANTAMENTO = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "COD_SUBTIPOADIANTAMENTO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_SUBTIPOADIANTAMENTO;

    /**
    * @generated
    */
    @Column(name = "DES_SUBTIPOADIANTAMENTO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_SUBTIPOADIANTAMENTO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_LASTREC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_LASTREC;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String coD_USUARIO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_TIPOADIANTAMENTO", nullable = true, referencedColumnName = "ID_TIPOADIANTAMENTO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PCA_TIPOADIANTAMENTO id_TIPOADIANTAMENTO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_CONTA", nullable = true, referencedColumnName = "ID_CONTA", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PCA_PLANOCONTAS id_CONTA;

    /**
    * Construtor
    * @generated
    */
    public PCA_SUBTIPOADIANTAMENTO(){
    }

    /**
    * Obtém id_SUBTIPOADIANTAMENTO
    * return id_SUBTIPOADIANTAMENTO
    * @generated
    */
    
    public java.lang.String getId_SUBTIPOADIANTAMENTO(){
        return this.id_SUBTIPOADIANTAMENTO;
    }

    /**
    * Define id_SUBTIPOADIANTAMENTO
    * @param id_SUBTIPOADIANTAMENTO id_SUBTIPOADIANTAMENTO
    * @generated
    */
    public PCA_SUBTIPOADIANTAMENTO setId_SUBTIPOADIANTAMENTO(java.lang.String id_SUBTIPOADIANTAMENTO){
        this.id_SUBTIPOADIANTAMENTO = id_SUBTIPOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém coD_SUBTIPOADIANTAMENTO
    * return coD_SUBTIPOADIANTAMENTO
    * @generated
    */
    
    public java.lang.Integer getCoD_SUBTIPOADIANTAMENTO(){
        return this.coD_SUBTIPOADIANTAMENTO;
    }

    /**
    * Define coD_SUBTIPOADIANTAMENTO
    * @param coD_SUBTIPOADIANTAMENTO coD_SUBTIPOADIANTAMENTO
    * @generated
    */
    public PCA_SUBTIPOADIANTAMENTO setCoD_SUBTIPOADIANTAMENTO(java.lang.Integer coD_SUBTIPOADIANTAMENTO){
        this.coD_SUBTIPOADIANTAMENTO = coD_SUBTIPOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém deS_SUBTIPOADIANTAMENTO
    * return deS_SUBTIPOADIANTAMENTO
    * @generated
    */
    
    public java.lang.String getDeS_SUBTIPOADIANTAMENTO(){
        return this.deS_SUBTIPOADIANTAMENTO;
    }

    /**
    * Define deS_SUBTIPOADIANTAMENTO
    * @param deS_SUBTIPOADIANTAMENTO deS_SUBTIPOADIANTAMENTO
    * @generated
    */
    public PCA_SUBTIPOADIANTAMENTO setDeS_SUBTIPOADIANTAMENTO(java.lang.String deS_SUBTIPOADIANTAMENTO){
        this.deS_SUBTIPOADIANTAMENTO = deS_SUBTIPOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém daT_LASTREC
    * return daT_LASTREC
    * @generated
    */
    
    public java.util.Date getDaT_LASTREC(){
        return this.daT_LASTREC;
    }

    /**
    * Define daT_LASTREC
    * @param daT_LASTREC daT_LASTREC
    * @generated
    */
    public PCA_SUBTIPOADIANTAMENTO setDaT_LASTREC(java.util.Date daT_LASTREC){
        this.daT_LASTREC = daT_LASTREC;
        return this;
    }
    /**
    * Obtém coD_USUARIO
    * return coD_USUARIO
    * @generated
    */
    
    public java.lang.String getCoD_USUARIO(){
        return this.coD_USUARIO;
    }

    /**
    * Define coD_USUARIO
    * @param coD_USUARIO coD_USUARIO
    * @generated
    */
    public PCA_SUBTIPOADIANTAMENTO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém id_TIPOADIANTAMENTO
    * return id_TIPOADIANTAMENTO
    * @generated
    */
    
    public PCA_TIPOADIANTAMENTO getId_TIPOADIANTAMENTO(){
        return this.id_TIPOADIANTAMENTO;
    }

    /**
    * Define id_TIPOADIANTAMENTO
    * @param id_TIPOADIANTAMENTO id_TIPOADIANTAMENTO
    * @generated
    */
    public PCA_SUBTIPOADIANTAMENTO setId_TIPOADIANTAMENTO(PCA_TIPOADIANTAMENTO id_TIPOADIANTAMENTO){
        this.id_TIPOADIANTAMENTO = id_TIPOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém id_CONTA
    * return id_CONTA
    * @generated
    */
    
    public PCA_PLANOCONTAS getId_CONTA(){
        return this.id_CONTA;
    }

    /**
    * Define id_CONTA
    * @param id_CONTA id_CONTA
    * @generated
    */
    public PCA_SUBTIPOADIANTAMENTO setId_CONTA(PCA_PLANOCONTAS id_CONTA){
        this.id_CONTA = id_CONTA;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PCA_SUBTIPOADIANTAMENTO object = (PCA_SUBTIPOADIANTAMENTO)obj;
        if (id_SUBTIPOADIANTAMENTO != null ? !id_SUBTIPOADIANTAMENTO.equals(object.id_SUBTIPOADIANTAMENTO) : object.id_SUBTIPOADIANTAMENTO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_SUBTIPOADIANTAMENTO == null) ? 0 : id_SUBTIPOADIANTAMENTO.hashCode());
        return result;
    }

}