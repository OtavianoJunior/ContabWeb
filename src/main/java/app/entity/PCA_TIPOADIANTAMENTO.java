package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PCA_TIPOADIANTAMENTO
* @generated
*/
@Entity
@Table(name = "\"PCA_TIPOADIANTAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PCA_TIPOADIANTAMENTO")
public class PCA_TIPOADIANTAMENTO implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPOADIANTAMENTO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_TIPOADIANTAMENTO;

    /**
    * @generated
    */
    @Column(name = "COD_TIPOADIANTAMENTO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_TIPOADIANTAMENTO;

    /**
    * @generated
    */
    @Column(name = "DES_TIPOADIANTAMENTO", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_TIPOADIANTAMENTO;

    /**
    * @generated
    */
    @Column(name = "FGL_EXIGEPRESTACAOCONTA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String fgL_EXIGEPRESTACAOCONTA;

    /**
    * @generated
    */
    @Column(name = "NRO_MAXDEPENDENCIA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nrO_MAXDEPENDENCIA;

    /**
    * @generated
    */
    @Column(name = "IDT_RECEITADESPESA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String idT_RECEITADESPESA;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_DESATIVACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_DESATIVACAO;

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
    @JoinColumn(name="ID_ENTIDADE", nullable = true, referencedColumnName = "ID_ENTIDADE", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ENTIDADE id_ENTIDADE;

    /**
    * Construtor
    * @generated
    */
    public PCA_TIPOADIANTAMENTO(){
    }

    /**
    * Obtém id_TIPOADIANTAMENTO
    * return id_TIPOADIANTAMENTO
    * @generated
    */
    
    public java.lang.Integer getId_TIPOADIANTAMENTO(){
        return this.id_TIPOADIANTAMENTO;
    }

    /**
    * Define id_TIPOADIANTAMENTO
    * @param id_TIPOADIANTAMENTO id_TIPOADIANTAMENTO
    * @generated
    */
    public PCA_TIPOADIANTAMENTO setId_TIPOADIANTAMENTO(java.lang.Integer id_TIPOADIANTAMENTO){
        this.id_TIPOADIANTAMENTO = id_TIPOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém coD_TIPOADIANTAMENTO
    * return coD_TIPOADIANTAMENTO
    * @generated
    */
    
    public java.lang.Integer getCoD_TIPOADIANTAMENTO(){
        return this.coD_TIPOADIANTAMENTO;
    }

    /**
    * Define coD_TIPOADIANTAMENTO
    * @param coD_TIPOADIANTAMENTO coD_TIPOADIANTAMENTO
    * @generated
    */
    public PCA_TIPOADIANTAMENTO setCoD_TIPOADIANTAMENTO(java.lang.Integer coD_TIPOADIANTAMENTO){
        this.coD_TIPOADIANTAMENTO = coD_TIPOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém deS_TIPOADIANTAMENTO
    * return deS_TIPOADIANTAMENTO
    * @generated
    */
    
    public java.lang.String getDeS_TIPOADIANTAMENTO(){
        return this.deS_TIPOADIANTAMENTO;
    }

    /**
    * Define deS_TIPOADIANTAMENTO
    * @param deS_TIPOADIANTAMENTO deS_TIPOADIANTAMENTO
    * @generated
    */
    public PCA_TIPOADIANTAMENTO setDeS_TIPOADIANTAMENTO(java.lang.String deS_TIPOADIANTAMENTO){
        this.deS_TIPOADIANTAMENTO = deS_TIPOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém fgL_EXIGEPRESTACAOCONTA
    * return fgL_EXIGEPRESTACAOCONTA
    * @generated
    */
    
    public java.lang.String getFgL_EXIGEPRESTACAOCONTA(){
        return this.fgL_EXIGEPRESTACAOCONTA;
    }

    /**
    * Define fgL_EXIGEPRESTACAOCONTA
    * @param fgL_EXIGEPRESTACAOCONTA fgL_EXIGEPRESTACAOCONTA
    * @generated
    */
    public PCA_TIPOADIANTAMENTO setFgL_EXIGEPRESTACAOCONTA(java.lang.String fgL_EXIGEPRESTACAOCONTA){
        this.fgL_EXIGEPRESTACAOCONTA = fgL_EXIGEPRESTACAOCONTA;
        return this;
    }
    /**
    * Obtém nrO_MAXDEPENDENCIA
    * return nrO_MAXDEPENDENCIA
    * @generated
    */
    
    public java.lang.Integer getNrO_MAXDEPENDENCIA(){
        return this.nrO_MAXDEPENDENCIA;
    }

    /**
    * Define nrO_MAXDEPENDENCIA
    * @param nrO_MAXDEPENDENCIA nrO_MAXDEPENDENCIA
    * @generated
    */
    public PCA_TIPOADIANTAMENTO setNrO_MAXDEPENDENCIA(java.lang.Integer nrO_MAXDEPENDENCIA){
        this.nrO_MAXDEPENDENCIA = nrO_MAXDEPENDENCIA;
        return this;
    }
    /**
    * Obtém idT_RECEITADESPESA
    * return idT_RECEITADESPESA
    * @generated
    */
    
    public java.lang.String getIdT_RECEITADESPESA(){
        return this.idT_RECEITADESPESA;
    }

    /**
    * Define idT_RECEITADESPESA
    * @param idT_RECEITADESPESA idT_RECEITADESPESA
    * @generated
    */
    public PCA_TIPOADIANTAMENTO setIdT_RECEITADESPESA(java.lang.String idT_RECEITADESPESA){
        this.idT_RECEITADESPESA = idT_RECEITADESPESA;
        return this;
    }
    /**
    * Obtém daT_DESATIVACAO
    * return daT_DESATIVACAO
    * @generated
    */
    
    public java.util.Date getDaT_DESATIVACAO(){
        return this.daT_DESATIVACAO;
    }

    /**
    * Define daT_DESATIVACAO
    * @param daT_DESATIVACAO daT_DESATIVACAO
    * @generated
    */
    public PCA_TIPOADIANTAMENTO setDaT_DESATIVACAO(java.util.Date daT_DESATIVACAO){
        this.daT_DESATIVACAO = daT_DESATIVACAO;
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
    public PCA_TIPOADIANTAMENTO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PCA_TIPOADIANTAMENTO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém id_ENTIDADE
    * return id_ENTIDADE
    * @generated
    */
    
    public ENTIDADE getId_ENTIDADE(){
        return this.id_ENTIDADE;
    }

    /**
    * Define id_ENTIDADE
    * @param id_ENTIDADE id_ENTIDADE
    * @generated
    */
    public PCA_TIPOADIANTAMENTO setId_ENTIDADE(ENTIDADE id_ENTIDADE){
        this.id_ENTIDADE = id_ENTIDADE;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PCA_TIPOADIANTAMENTO object = (PCA_TIPOADIANTAMENTO)obj;
        if (id_TIPOADIANTAMENTO != null ? !id_TIPOADIANTAMENTO.equals(object.id_TIPOADIANTAMENTO) : object.id_TIPOADIANTAMENTO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_TIPOADIANTAMENTO == null) ? 0 : id_TIPOADIANTAMENTO.hashCode());
        return result;
    }

}