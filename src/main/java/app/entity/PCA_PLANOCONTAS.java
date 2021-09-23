package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PCA_PLANOCONTAS
* @generated
*/
@Entity
@Table(name = "\"PCA_PLANOCONTAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PCA_PLANOCONTAS")
public class PCA_PLANOCONTAS implements Serializable {

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
    @Column(name = "ID_CONTA", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_CONTA;

    /**
    * @generated
    */
    @Column(name = "COD_CONTA", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String coD_CONTA;

    /**
    * @generated
    */
    @Column(name = "DES_CONTA", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_CONTA;

    /**
    * @generated
    */
    @Column(name = "COD_CONTASEMMASCARA", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String coD_CONTASEMMASCARA;

    /**
    * @generated
    */
    @Column(name = "FLG_ULTIMONIVEL", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_ULTIMONIVEL;

    /**
    * @generated
    */
    @Column(name = "FLG_ENCERRASALDO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_ENCERRASALDO;

    /**
    * @generated
    */
    @Column(name = "FGL_INVERSAOSALDO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String fgL_INVERSAOSALDO;

    /**
    * @generated
    */
    @Column(name = "IDT_NATUREZACONTA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String idT_NATUREZACONTA;

    /**
    * @generated
    */
    @Column(name = "IDT_VINCULAVPDVPA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String idT_VINCULAVPDVPA;

    /**
    * @generated
    */
    @Column(name = "IDT_VINCULARECEITADESPESA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String idT_VINCULARECEITADESPESA;

    /**
    * @generated
    */
    @Column(name = "FLG_SINTETIDA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_SINTETIDA;

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
    @JoinColumn(name="ID_ESTRUTURAPLANO", nullable = true, referencedColumnName = "ID_ESTRUTURAPLANO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PCA_ESTRUTURAPLANO id_ESTRUTURAPLANO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_CONTASUPERIOR", nullable = true, referencedColumnName = "ID_CONTA", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PCA_PLANOCONTAS id_CONTASUPERIOR;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_CT_CTCOR", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private CT_CTCOR id_CT_CTCOR;

    /**
    * Construtor
    * @generated
    */
    public PCA_PLANOCONTAS(){
    }

    /**
    * Obtém id_CONTA
    * return id_CONTA
    * @generated
    */
    
    public java.lang.Integer getId_CONTA(){
        return this.id_CONTA;
    }

    /**
    * Define id_CONTA
    * @param id_CONTA id_CONTA
    * @generated
    */
    public PCA_PLANOCONTAS setId_CONTA(java.lang.Integer id_CONTA){
        this.id_CONTA = id_CONTA;
        return this;
    }
    /**
    * Obtém coD_CONTA
    * return coD_CONTA
    * @generated
    */
    
    public java.lang.String getCoD_CONTA(){
        return this.coD_CONTA;
    }

    /**
    * Define coD_CONTA
    * @param coD_CONTA coD_CONTA
    * @generated
    */
    public PCA_PLANOCONTAS setCoD_CONTA(java.lang.String coD_CONTA){
        this.coD_CONTA = coD_CONTA;
        return this;
    }
    /**
    * Obtém deS_CONTA
    * return deS_CONTA
    * @generated
    */
    
    public java.lang.String getDeS_CONTA(){
        return this.deS_CONTA;
    }

    /**
    * Define deS_CONTA
    * @param deS_CONTA deS_CONTA
    * @generated
    */
    public PCA_PLANOCONTAS setDeS_CONTA(java.lang.String deS_CONTA){
        this.deS_CONTA = deS_CONTA;
        return this;
    }
    /**
    * Obtém coD_CONTASEMMASCARA
    * return coD_CONTASEMMASCARA
    * @generated
    */
    
    public java.lang.String getCoD_CONTASEMMASCARA(){
        return this.coD_CONTASEMMASCARA;
    }

    /**
    * Define coD_CONTASEMMASCARA
    * @param coD_CONTASEMMASCARA coD_CONTASEMMASCARA
    * @generated
    */
    public PCA_PLANOCONTAS setCoD_CONTASEMMASCARA(java.lang.String coD_CONTASEMMASCARA){
        this.coD_CONTASEMMASCARA = coD_CONTASEMMASCARA;
        return this;
    }
    /**
    * Obtém flG_ULTIMONIVEL
    * return flG_ULTIMONIVEL
    * @generated
    */
    
    public java.lang.String getFlG_ULTIMONIVEL(){
        return this.flG_ULTIMONIVEL;
    }

    /**
    * Define flG_ULTIMONIVEL
    * @param flG_ULTIMONIVEL flG_ULTIMONIVEL
    * @generated
    */
    public PCA_PLANOCONTAS setFlG_ULTIMONIVEL(java.lang.String flG_ULTIMONIVEL){
        this.flG_ULTIMONIVEL = flG_ULTIMONIVEL;
        return this;
    }
    /**
    * Obtém flG_ENCERRASALDO
    * return flG_ENCERRASALDO
    * @generated
    */
    
    public java.lang.String getFlG_ENCERRASALDO(){
        return this.flG_ENCERRASALDO;
    }

    /**
    * Define flG_ENCERRASALDO
    * @param flG_ENCERRASALDO flG_ENCERRASALDO
    * @generated
    */
    public PCA_PLANOCONTAS setFlG_ENCERRASALDO(java.lang.String flG_ENCERRASALDO){
        this.flG_ENCERRASALDO = flG_ENCERRASALDO;
        return this;
    }
    /**
    * Obtém fgL_INVERSAOSALDO
    * return fgL_INVERSAOSALDO
    * @generated
    */
    
    public java.lang.String getFgL_INVERSAOSALDO(){
        return this.fgL_INVERSAOSALDO;
    }

    /**
    * Define fgL_INVERSAOSALDO
    * @param fgL_INVERSAOSALDO fgL_INVERSAOSALDO
    * @generated
    */
    public PCA_PLANOCONTAS setFgL_INVERSAOSALDO(java.lang.String fgL_INVERSAOSALDO){
        this.fgL_INVERSAOSALDO = fgL_INVERSAOSALDO;
        return this;
    }
    /**
    * Obtém idT_NATUREZACONTA
    * return idT_NATUREZACONTA
    * @generated
    */
    
    public java.lang.String getIdT_NATUREZACONTA(){
        return this.idT_NATUREZACONTA;
    }

    /**
    * Define idT_NATUREZACONTA
    * @param idT_NATUREZACONTA idT_NATUREZACONTA
    * @generated
    */
    public PCA_PLANOCONTAS setIdT_NATUREZACONTA(java.lang.String idT_NATUREZACONTA){
        this.idT_NATUREZACONTA = idT_NATUREZACONTA;
        return this;
    }
    /**
    * Obtém idT_VINCULAVPDVPA
    * return idT_VINCULAVPDVPA
    * @generated
    */
    
    public java.lang.String getIdT_VINCULAVPDVPA(){
        return this.idT_VINCULAVPDVPA;
    }

    /**
    * Define idT_VINCULAVPDVPA
    * @param idT_VINCULAVPDVPA idT_VINCULAVPDVPA
    * @generated
    */
    public PCA_PLANOCONTAS setIdT_VINCULAVPDVPA(java.lang.String idT_VINCULAVPDVPA){
        this.idT_VINCULAVPDVPA = idT_VINCULAVPDVPA;
        return this;
    }
    /**
    * Obtém idT_VINCULARECEITADESPESA
    * return idT_VINCULARECEITADESPESA
    * @generated
    */
    
    public java.lang.String getIdT_VINCULARECEITADESPESA(){
        return this.idT_VINCULARECEITADESPESA;
    }

    /**
    * Define idT_VINCULARECEITADESPESA
    * @param idT_VINCULARECEITADESPESA idT_VINCULARECEITADESPESA
    * @generated
    */
    public PCA_PLANOCONTAS setIdT_VINCULARECEITADESPESA(java.lang.String idT_VINCULARECEITADESPESA){
        this.idT_VINCULARECEITADESPESA = idT_VINCULARECEITADESPESA;
        return this;
    }
    /**
    * Obtém flG_SINTETIDA
    * return flG_SINTETIDA
    * @generated
    */
    
    public java.lang.String getFlG_SINTETIDA(){
        return this.flG_SINTETIDA;
    }

    /**
    * Define flG_SINTETIDA
    * @param flG_SINTETIDA flG_SINTETIDA
    * @generated
    */
    public PCA_PLANOCONTAS setFlG_SINTETIDA(java.lang.String flG_SINTETIDA){
        this.flG_SINTETIDA = flG_SINTETIDA;
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
    public PCA_PLANOCONTAS setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PCA_PLANOCONTAS setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém id_ESTRUTURAPLANO
    * return id_ESTRUTURAPLANO
    * @generated
    */
    
    public PCA_ESTRUTURAPLANO getId_ESTRUTURAPLANO(){
        return this.id_ESTRUTURAPLANO;
    }

    /**
    * Define id_ESTRUTURAPLANO
    * @param id_ESTRUTURAPLANO id_ESTRUTURAPLANO
    * @generated
    */
    public PCA_PLANOCONTAS setId_ESTRUTURAPLANO(PCA_ESTRUTURAPLANO id_ESTRUTURAPLANO){
        this.id_ESTRUTURAPLANO = id_ESTRUTURAPLANO;
        return this;
    }
    /**
    * Obtém id_CONTASUPERIOR
    * return id_CONTASUPERIOR
    * @generated
    */
    
    public PCA_PLANOCONTAS getId_CONTASUPERIOR(){
        return this.id_CONTASUPERIOR;
    }

    /**
    * Define id_CONTASUPERIOR
    * @param id_CONTASUPERIOR id_CONTASUPERIOR
    * @generated
    */
    public PCA_PLANOCONTAS setId_CONTASUPERIOR(PCA_PLANOCONTAS id_CONTASUPERIOR){
        this.id_CONTASUPERIOR = id_CONTASUPERIOR;
        return this;
    }
    /**
    * Obtém id_CT_CTCOR
    * return id_CT_CTCOR
    * @generated
    */
    
    public CT_CTCOR getId_CT_CTCOR(){
        return this.id_CT_CTCOR;
    }

    /**
    * Define id_CT_CTCOR
    * @param id_CT_CTCOR id_CT_CTCOR
    * @generated
    */
    public PCA_PLANOCONTAS setId_CT_CTCOR(CT_CTCOR id_CT_CTCOR){
        this.id_CT_CTCOR = id_CT_CTCOR;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PCA_PLANOCONTAS object = (PCA_PLANOCONTAS)obj;
        if (id_CONTA != null ? !id_CONTA.equals(object.id_CONTA) : object.id_CONTA != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_CONTA == null) ? 0 : id_CONTA.hashCode());
        return result;
    }

}