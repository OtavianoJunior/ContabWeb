package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ANOFISCALENTIDADE
* @generated
*/
@Entity
@Table(name = "\"ANOFISCALENTIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ANOFISCALENTIDADE")
public class ANOFISCALENTIDADE implements Serializable {

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
    @Column(name = "ID_ANOFISCAL", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_ANOFISCAL;

    /**
    * @generated
    */
    @Column(name = "NRO_ANOFISCAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nrO_ANOFISCAL;

    /**
    * @generated
    */
    @Column(name = "DES_MASCCONTAB", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String deS_MASCCONTAB;

    /**
    * @generated
    */
    @Column(name = "DES_UNIDORC", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String deS_UNIDORC;

    /**
    * @generated
    */
    @Column(name = "DES_MASCRECEITA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String deS_MASCRECEITA;

    /**
    * @generated
    */
    @Column(name = "DES_MASCDESPESAFIXA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String deS_MASCDESPESAFIXA;

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
    @JoinColumn(name="ID_ENTIDADE", nullable = true, referencedColumnName = "ID_ENTIDADE", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ENTIDADE id_ENTIDADE;

    /**
    * Construtor
    * @generated
    */
    public ANOFISCALENTIDADE(){
    }

    /**
    * Obtém id_ANOFISCAL
    * return id_ANOFISCAL
    * @generated
    */
    
    public java.lang.Integer getId_ANOFISCAL(){
        return this.id_ANOFISCAL;
    }

    /**
    * Define id_ANOFISCAL
    * @param id_ANOFISCAL id_ANOFISCAL
    * @generated
    */
    public ANOFISCALENTIDADE setId_ANOFISCAL(java.lang.Integer id_ANOFISCAL){
        this.id_ANOFISCAL = id_ANOFISCAL;
        return this;
    }
    /**
    * Obtém nrO_ANOFISCAL
    * return nrO_ANOFISCAL
    * @generated
    */
    
    public java.lang.Integer getNrO_ANOFISCAL(){
        return this.nrO_ANOFISCAL;
    }

    /**
    * Define nrO_ANOFISCAL
    * @param nrO_ANOFISCAL nrO_ANOFISCAL
    * @generated
    */
    public ANOFISCALENTIDADE setNrO_ANOFISCAL(java.lang.Integer nrO_ANOFISCAL){
        this.nrO_ANOFISCAL = nrO_ANOFISCAL;
        return this;
    }
    /**
    * Obtém deS_MASCCONTAB
    * return deS_MASCCONTAB
    * @generated
    */
    
    public java.lang.String getDeS_MASCCONTAB(){
        return this.deS_MASCCONTAB;
    }

    /**
    * Define deS_MASCCONTAB
    * @param deS_MASCCONTAB deS_MASCCONTAB
    * @generated
    */
    public ANOFISCALENTIDADE setDeS_MASCCONTAB(java.lang.String deS_MASCCONTAB){
        this.deS_MASCCONTAB = deS_MASCCONTAB;
        return this;
    }
    /**
    * Obtém deS_UNIDORC
    * return deS_UNIDORC
    * @generated
    */
    
    public java.lang.String getDeS_UNIDORC(){
        return this.deS_UNIDORC;
    }

    /**
    * Define deS_UNIDORC
    * @param deS_UNIDORC deS_UNIDORC
    * @generated
    */
    public ANOFISCALENTIDADE setDeS_UNIDORC(java.lang.String deS_UNIDORC){
        this.deS_UNIDORC = deS_UNIDORC;
        return this;
    }
    /**
    * Obtém deS_MASCRECEITA
    * return deS_MASCRECEITA
    * @generated
    */
    
    public java.lang.String getDeS_MASCRECEITA(){
        return this.deS_MASCRECEITA;
    }

    /**
    * Define deS_MASCRECEITA
    * @param deS_MASCRECEITA deS_MASCRECEITA
    * @generated
    */
    public ANOFISCALENTIDADE setDeS_MASCRECEITA(java.lang.String deS_MASCRECEITA){
        this.deS_MASCRECEITA = deS_MASCRECEITA;
        return this;
    }
    /**
    * Obtém deS_MASCDESPESAFIXA
    * return deS_MASCDESPESAFIXA
    * @generated
    */
    
    public java.lang.String getDeS_MASCDESPESAFIXA(){
        return this.deS_MASCDESPESAFIXA;
    }

    /**
    * Define deS_MASCDESPESAFIXA
    * @param deS_MASCDESPESAFIXA deS_MASCDESPESAFIXA
    * @generated
    */
    public ANOFISCALENTIDADE setDeS_MASCDESPESAFIXA(java.lang.String deS_MASCDESPESAFIXA){
        this.deS_MASCDESPESAFIXA = deS_MASCDESPESAFIXA;
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
    public ANOFISCALENTIDADE setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public ANOFISCALENTIDADE setCoD_USUARIO(java.lang.String coD_USUARIO){
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
    public ANOFISCALENTIDADE setId_ESTRUTURAPLANO(PCA_ESTRUTURAPLANO id_ESTRUTURAPLANO){
        this.id_ESTRUTURAPLANO = id_ESTRUTURAPLANO;
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
    public ANOFISCALENTIDADE setId_ENTIDADE(ENTIDADE id_ENTIDADE){
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
ANOFISCALENTIDADE object = (ANOFISCALENTIDADE)obj;
        if (id_ANOFISCAL != null ? !id_ANOFISCAL.equals(object.id_ANOFISCAL) : object.id_ANOFISCAL != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_ANOFISCAL == null) ? 0 : id_ANOFISCAL.hashCode());
        return result;
    }

}