package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PCA_ADIANTAMENTO
* @generated
*/
@Entity
@Table(name = "\"PCA_ADIANTAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PCA_ADIANTAMENTO")
public class PCA_ADIANTAMENTO implements Serializable {

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
    @Column(name = "ID_ADIANTAMENTO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_ADIANTAMENTO;

    /**
    * @generated
    */
    @Column(name = "NRO_ADIANTAMENTO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nrO_ADIANTAMENTO;

    /**
    * @generated
    */
    @Column(name = "DES_FINALIDADE", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_FINALIDADE;

    /**
    * @generated
    */
    @Column(name = "VLR_CONCEDIDO", nullable = true, unique = false, length=18, precision=2, insertable=true, updatable=true)
        
        private java.lang.Double vlR_CONCEDIDO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ADIANTAMENTO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_ADIANTAMENTO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_LIMITEPRESTACAOCONTA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_LIMITEPRESTACAOCONTA;

    /**
    * @generated
    */
    @Column(name = "DES_MOTIVOCANCELAMENTO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_MOTIVOCANCELAMENTO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_CANCELAMENTOADIANTAMENTO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_CANCELAMENTOADIANTAMENTO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATLASTREC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daTLASTREC;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String coD_USUARIO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="NRO_CUC", nullable = true, referencedColumnName = "NRO_CUC", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private CUC nrO_CUC;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_SUBTIPOADIANTAMENTO", nullable = true, referencedColumnName = "ID_SUBTIPOADIANTAMENTO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PCA_SUBTIPOADIANTAMENTO id_SUBTIPOADIANTAMENTO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_ANOFISCAL", nullable = true, referencedColumnName = "ID_ANOFISCAL", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ANOFISCALENTIDADE id_ANOFISCAL;

    /**
    * Construtor
    * @generated
    */
    public PCA_ADIANTAMENTO(){
    }

    /**
    * Obtém id_ADIANTAMENTO
    * return id_ADIANTAMENTO
    * @generated
    */
    
    public java.lang.Integer getId_ADIANTAMENTO(){
        return this.id_ADIANTAMENTO;
    }

    /**
    * Define id_ADIANTAMENTO
    * @param id_ADIANTAMENTO id_ADIANTAMENTO
    * @generated
    */
    public PCA_ADIANTAMENTO setId_ADIANTAMENTO(java.lang.Integer id_ADIANTAMENTO){
        this.id_ADIANTAMENTO = id_ADIANTAMENTO;
        return this;
    }
    /**
    * Obtém nrO_ADIANTAMENTO
    * return nrO_ADIANTAMENTO
    * @generated
    */
    
    public java.lang.Integer getNrO_ADIANTAMENTO(){
        return this.nrO_ADIANTAMENTO;
    }

    /**
    * Define nrO_ADIANTAMENTO
    * @param nrO_ADIANTAMENTO nrO_ADIANTAMENTO
    * @generated
    */
    public PCA_ADIANTAMENTO setNrO_ADIANTAMENTO(java.lang.Integer nrO_ADIANTAMENTO){
        this.nrO_ADIANTAMENTO = nrO_ADIANTAMENTO;
        return this;
    }
    /**
    * Obtém deS_FINALIDADE
    * return deS_FINALIDADE
    * @generated
    */
    
    public java.lang.String getDeS_FINALIDADE(){
        return this.deS_FINALIDADE;
    }

    /**
    * Define deS_FINALIDADE
    * @param deS_FINALIDADE deS_FINALIDADE
    * @generated
    */
    public PCA_ADIANTAMENTO setDeS_FINALIDADE(java.lang.String deS_FINALIDADE){
        this.deS_FINALIDADE = deS_FINALIDADE;
        return this;
    }
    /**
    * Obtém vlR_CONCEDIDO
    * return vlR_CONCEDIDO
    * @generated
    */
    
    public java.lang.Double getVlR_CONCEDIDO(){
        return this.vlR_CONCEDIDO;
    }

    /**
    * Define vlR_CONCEDIDO
    * @param vlR_CONCEDIDO vlR_CONCEDIDO
    * @generated
    */
    public PCA_ADIANTAMENTO setVlR_CONCEDIDO(java.lang.Double vlR_CONCEDIDO){
        this.vlR_CONCEDIDO = vlR_CONCEDIDO;
        return this;
    }
    /**
    * Obtém daT_ADIANTAMENTO
    * return daT_ADIANTAMENTO
    * @generated
    */
    
    public java.util.Date getDaT_ADIANTAMENTO(){
        return this.daT_ADIANTAMENTO;
    }

    /**
    * Define daT_ADIANTAMENTO
    * @param daT_ADIANTAMENTO daT_ADIANTAMENTO
    * @generated
    */
    public PCA_ADIANTAMENTO setDaT_ADIANTAMENTO(java.util.Date daT_ADIANTAMENTO){
        this.daT_ADIANTAMENTO = daT_ADIANTAMENTO;
        return this;
    }
    /**
    * Obtém daT_LIMITEPRESTACAOCONTA
    * return daT_LIMITEPRESTACAOCONTA
    * @generated
    */
    
    public java.util.Date getDaT_LIMITEPRESTACAOCONTA(){
        return this.daT_LIMITEPRESTACAOCONTA;
    }

    /**
    * Define daT_LIMITEPRESTACAOCONTA
    * @param daT_LIMITEPRESTACAOCONTA daT_LIMITEPRESTACAOCONTA
    * @generated
    */
    public PCA_ADIANTAMENTO setDaT_LIMITEPRESTACAOCONTA(java.util.Date daT_LIMITEPRESTACAOCONTA){
        this.daT_LIMITEPRESTACAOCONTA = daT_LIMITEPRESTACAOCONTA;
        return this;
    }
    /**
    * Obtém deS_MOTIVOCANCELAMENTO
    * return deS_MOTIVOCANCELAMENTO
    * @generated
    */
    
    public java.lang.String getDeS_MOTIVOCANCELAMENTO(){
        return this.deS_MOTIVOCANCELAMENTO;
    }

    /**
    * Define deS_MOTIVOCANCELAMENTO
    * @param deS_MOTIVOCANCELAMENTO deS_MOTIVOCANCELAMENTO
    * @generated
    */
    public PCA_ADIANTAMENTO setDeS_MOTIVOCANCELAMENTO(java.lang.String deS_MOTIVOCANCELAMENTO){
        this.deS_MOTIVOCANCELAMENTO = deS_MOTIVOCANCELAMENTO;
        return this;
    }
    /**
    * Obtém daT_CANCELAMENTOADIANTAMENTO
    * return daT_CANCELAMENTOADIANTAMENTO
    * @generated
    */
    
    public java.util.Date getDaT_CANCELAMENTOADIANTAMENTO(){
        return this.daT_CANCELAMENTOADIANTAMENTO;
    }

    /**
    * Define daT_CANCELAMENTOADIANTAMENTO
    * @param daT_CANCELAMENTOADIANTAMENTO daT_CANCELAMENTOADIANTAMENTO
    * @generated
    */
    public PCA_ADIANTAMENTO setDaT_CANCELAMENTOADIANTAMENTO(java.util.Date daT_CANCELAMENTOADIANTAMENTO){
        this.daT_CANCELAMENTOADIANTAMENTO = daT_CANCELAMENTOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém daTLASTREC
    * return daTLASTREC
    * @generated
    */
    
    public java.util.Date getDaTLASTREC(){
        return this.daTLASTREC;
    }

    /**
    * Define daTLASTREC
    * @param daTLASTREC daTLASTREC
    * @generated
    */
    public PCA_ADIANTAMENTO setDaTLASTREC(java.util.Date daTLASTREC){
        this.daTLASTREC = daTLASTREC;
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
    public PCA_ADIANTAMENTO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém nrO_CUC
    * return nrO_CUC
    * @generated
    */
    
    public CUC getNrO_CUC(){
        return this.nrO_CUC;
    }

    /**
    * Define nrO_CUC
    * @param nrO_CUC nrO_CUC
    * @generated
    */
    public PCA_ADIANTAMENTO setNrO_CUC(CUC nrO_CUC){
        this.nrO_CUC = nrO_CUC;
        return this;
    }
    /**
    * Obtém id_SUBTIPOADIANTAMENTO
    * return id_SUBTIPOADIANTAMENTO
    * @generated
    */
    
    public PCA_SUBTIPOADIANTAMENTO getId_SUBTIPOADIANTAMENTO(){
        return this.id_SUBTIPOADIANTAMENTO;
    }

    /**
    * Define id_SUBTIPOADIANTAMENTO
    * @param id_SUBTIPOADIANTAMENTO id_SUBTIPOADIANTAMENTO
    * @generated
    */
    public PCA_ADIANTAMENTO setId_SUBTIPOADIANTAMENTO(PCA_SUBTIPOADIANTAMENTO id_SUBTIPOADIANTAMENTO){
        this.id_SUBTIPOADIANTAMENTO = id_SUBTIPOADIANTAMENTO;
        return this;
    }
    /**
    * Obtém id_ANOFISCAL
    * return id_ANOFISCAL
    * @generated
    */
    
    public ANOFISCALENTIDADE getId_ANOFISCAL(){
        return this.id_ANOFISCAL;
    }

    /**
    * Define id_ANOFISCAL
    * @param id_ANOFISCAL id_ANOFISCAL
    * @generated
    */
    public PCA_ADIANTAMENTO setId_ANOFISCAL(ANOFISCALENTIDADE id_ANOFISCAL){
        this.id_ANOFISCAL = id_ANOFISCAL;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PCA_ADIANTAMENTO object = (PCA_ADIANTAMENTO)obj;
        if (id_ADIANTAMENTO != null ? !id_ADIANTAMENTO.equals(object.id_ADIANTAMENTO) : object.id_ADIANTAMENTO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_ADIANTAMENTO == null) ? 0 : id_ADIANTAMENTO.hashCode());
        return result;
    }

}