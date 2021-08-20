package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela EMPENHO
* @generated
*/
@Entity
@Table(name = "\"EMPENHO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.EMPENHO")
public class EMPENHO implements Serializable {

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
    @Column(name = "ID_EMPENHO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_EMPENHO;

    /**
    * @generated
    */
    @Column(name = "NRO_EMPENHO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nrO_EMPENHO;

    /**
    * @generated
    */
    @Column(name = "VLR_EMPENHO", nullable = true, unique = false, length=18, precision=2, insertable=true, updatable=true)
        
        private java.lang.Double vlR_EMPENHO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_EMPENHO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_EMPENHO;

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
    @JoinColumn(name="NRO_CUC", nullable = true, referencedColumnName = "NRO_CUC", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private CUC nrO_CUC;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_DESPESACLASSIFICACAO", nullable = true, referencedColumnName = "ID_DESPESACLASSIFICACAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private DESPESACLASSIFICACAO id_DESPESACLASSIFICACAO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_ADIANTAMENTO", nullable = true, referencedColumnName = "ID_ADIANTAMENTO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PCA_ADIANTAMENTO id_ADIANTAMENTO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="iD_ANOFISCAL", nullable = true, referencedColumnName = "ID_ANOFISCAL", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ANOFISCALENTIDADE id_ANOFISCAL;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="SEQ_DESPESAORCAMENTO", nullable = true, referencedColumnName = "SEQ_DESPESAORCAMENTO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private DESPESAORCAMENTO seQ_DESPESAORCAMENTO;

    /**
    * Construtor
    * @generated
    */
    public EMPENHO(){
    }

    /**
    * Obtém id_EMPENHO
    * return id_EMPENHO
    * @generated
    */
    
    public java.lang.Integer getId_EMPENHO(){
        return this.id_EMPENHO;
    }

    /**
    * Define id_EMPENHO
    * @param id_EMPENHO id_EMPENHO
    * @generated
    */
    public EMPENHO setId_EMPENHO(java.lang.Integer id_EMPENHO){
        this.id_EMPENHO = id_EMPENHO;
        return this;
    }
    /**
    * Obtém nrO_EMPENHO
    * return nrO_EMPENHO
    * @generated
    */
    
    public java.lang.Integer getNrO_EMPENHO(){
        return this.nrO_EMPENHO;
    }

    /**
    * Define nrO_EMPENHO
    * @param nrO_EMPENHO nrO_EMPENHO
    * @generated
    */
    public EMPENHO setNrO_EMPENHO(java.lang.Integer nrO_EMPENHO){
        this.nrO_EMPENHO = nrO_EMPENHO;
        return this;
    }
    /**
    * Obtém vlR_EMPENHO
    * return vlR_EMPENHO
    * @generated
    */
    
    public java.lang.Double getVlR_EMPENHO(){
        return this.vlR_EMPENHO;
    }

    /**
    * Define vlR_EMPENHO
    * @param vlR_EMPENHO vlR_EMPENHO
    * @generated
    */
    public EMPENHO setVlR_EMPENHO(java.lang.Double vlR_EMPENHO){
        this.vlR_EMPENHO = vlR_EMPENHO;
        return this;
    }
    /**
    * Obtém daT_EMPENHO
    * return daT_EMPENHO
    * @generated
    */
    
    public java.util.Date getDaT_EMPENHO(){
        return this.daT_EMPENHO;
    }

    /**
    * Define daT_EMPENHO
    * @param daT_EMPENHO daT_EMPENHO
    * @generated
    */
    public EMPENHO setDaT_EMPENHO(java.util.Date daT_EMPENHO){
        this.daT_EMPENHO = daT_EMPENHO;
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
    public EMPENHO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public EMPENHO setCoD_USUARIO(java.lang.String coD_USUARIO){
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
    public EMPENHO setNrO_CUC(CUC nrO_CUC){
        this.nrO_CUC = nrO_CUC;
        return this;
    }
    /**
    * Obtém id_DESPESACLASSIFICACAO
    * return id_DESPESACLASSIFICACAO
    * @generated
    */
    
    public DESPESACLASSIFICACAO getId_DESPESACLASSIFICACAO(){
        return this.id_DESPESACLASSIFICACAO;
    }

    /**
    * Define id_DESPESACLASSIFICACAO
    * @param id_DESPESACLASSIFICACAO id_DESPESACLASSIFICACAO
    * @generated
    */
    public EMPENHO setId_DESPESACLASSIFICACAO(DESPESACLASSIFICACAO id_DESPESACLASSIFICACAO){
        this.id_DESPESACLASSIFICACAO = id_DESPESACLASSIFICACAO;
        return this;
    }
    /**
    * Obtém id_ADIANTAMENTO
    * return id_ADIANTAMENTO
    * @generated
    */
    
    public PCA_ADIANTAMENTO getId_ADIANTAMENTO(){
        return this.id_ADIANTAMENTO;
    }

    /**
    * Define id_ADIANTAMENTO
    * @param id_ADIANTAMENTO id_ADIANTAMENTO
    * @generated
    */
    public EMPENHO setId_ADIANTAMENTO(PCA_ADIANTAMENTO id_ADIANTAMENTO){
        this.id_ADIANTAMENTO = id_ADIANTAMENTO;
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
    public EMPENHO setId_ANOFISCAL(ANOFISCALENTIDADE id_ANOFISCAL){
        this.id_ANOFISCAL = id_ANOFISCAL;
        return this;
    }
    /**
    * Obtém seQ_DESPESAORCAMENTO
    * return seQ_DESPESAORCAMENTO
    * @generated
    */
    
    public DESPESAORCAMENTO getSeQ_DESPESAORCAMENTO(){
        return this.seQ_DESPESAORCAMENTO;
    }

    /**
    * Define seQ_DESPESAORCAMENTO
    * @param seQ_DESPESAORCAMENTO seQ_DESPESAORCAMENTO
    * @generated
    */
    public EMPENHO setSeQ_DESPESAORCAMENTO(DESPESAORCAMENTO seQ_DESPESAORCAMENTO){
        this.seQ_DESPESAORCAMENTO = seQ_DESPESAORCAMENTO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
EMPENHO object = (EMPENHO)obj;
        if (id_EMPENHO != null ? !id_EMPENHO.equals(object.id_EMPENHO) : object.id_EMPENHO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_EMPENHO == null) ? 0 : id_EMPENHO.hashCode());
        return result;
    }

}