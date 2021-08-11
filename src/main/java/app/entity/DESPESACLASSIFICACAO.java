package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela DESPESACLASSIFICACAO
* @generated
*/
@Entity
@Table(name = "\"DESPESACLASSIFICACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.DESPESACLASSIFICACAO")
public class DESPESACLASSIFICACAO implements Serializable {

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
    @Column(name = "ID_DESPESACLASSIFICACAO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_DESPESACLASSIFICACAO;

    /**
    * @generated
    */
    @Column(name = "COD_DESPESA", nullable = true, unique = false, length=13, insertable=true, updatable=true)
        
        private java.lang.String coD_DESPESA;

    /**
    * @generated
    */
    @Column(name = "COD_DESPESASEMMASCARA", nullable = true, unique = false, length=13, insertable=true, updatable=true)
        
        private java.lang.String coD_DESPESASEMMASCARA;

    /**
    * @generated
    */
    @Column(name = "DES_DESPESA", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_DESPESA;

    /**
    * @generated
    */
    @Column(name = "FLG_SICOM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_SICOM;

    /**
    * @generated
    */
    @Column(name = "IDT_TIPODESPESA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String idT_TIPODESPESA;

    /**
    * @generated
    */
    @Column(name = "FLG_SINTETICA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_SINTETICA;

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
    @JoinColumn(name="COD_DESPESASUP", nullable = true, referencedColumnName = "ID_DESPESACLASSIFICACAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private DESPESACLASSIFICACAO coD_DESPESASUP;

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
    public DESPESACLASSIFICACAO(){
    }

    /**
    * Obtém id_DESPESACLASSIFICACAO
    * return id_DESPESACLASSIFICACAO
    * @generated
    */
    
    public java.lang.Integer getId_DESPESACLASSIFICACAO(){
        return this.id_DESPESACLASSIFICACAO;
    }

    /**
    * Define id_DESPESACLASSIFICACAO
    * @param id_DESPESACLASSIFICACAO id_DESPESACLASSIFICACAO
    * @generated
    */
    public DESPESACLASSIFICACAO setId_DESPESACLASSIFICACAO(java.lang.Integer id_DESPESACLASSIFICACAO){
        this.id_DESPESACLASSIFICACAO = id_DESPESACLASSIFICACAO;
        return this;
    }
    /**
    * Obtém coD_DESPESA
    * return coD_DESPESA
    * @generated
    */
    
    public java.lang.String getCoD_DESPESA(){
        return this.coD_DESPESA;
    }

    /**
    * Define coD_DESPESA
    * @param coD_DESPESA coD_DESPESA
    * @generated
    */
    public DESPESACLASSIFICACAO setCoD_DESPESA(java.lang.String coD_DESPESA){
        this.coD_DESPESA = coD_DESPESA;
        return this;
    }
    /**
    * Obtém coD_DESPESASEMMASCARA
    * return coD_DESPESASEMMASCARA
    * @generated
    */
    
    public java.lang.String getCoD_DESPESASEMMASCARA(){
        return this.coD_DESPESASEMMASCARA;
    }

    /**
    * Define coD_DESPESASEMMASCARA
    * @param coD_DESPESASEMMASCARA coD_DESPESASEMMASCARA
    * @generated
    */
    public DESPESACLASSIFICACAO setCoD_DESPESASEMMASCARA(java.lang.String coD_DESPESASEMMASCARA){
        this.coD_DESPESASEMMASCARA = coD_DESPESASEMMASCARA;
        return this;
    }
    /**
    * Obtém deS_DESPESA
    * return deS_DESPESA
    * @generated
    */
    
    public java.lang.String getDeS_DESPESA(){
        return this.deS_DESPESA;
    }

    /**
    * Define deS_DESPESA
    * @param deS_DESPESA deS_DESPESA
    * @generated
    */
    public DESPESACLASSIFICACAO setDeS_DESPESA(java.lang.String deS_DESPESA){
        this.deS_DESPESA = deS_DESPESA;
        return this;
    }
    /**
    * Obtém flG_SICOM
    * return flG_SICOM
    * @generated
    */
    
    public java.lang.String getFlG_SICOM(){
        return this.flG_SICOM;
    }

    /**
    * Define flG_SICOM
    * @param flG_SICOM flG_SICOM
    * @generated
    */
    public DESPESACLASSIFICACAO setFlG_SICOM(java.lang.String flG_SICOM){
        this.flG_SICOM = flG_SICOM;
        return this;
    }
    /**
    * Obtém idT_TIPODESPESA
    * return idT_TIPODESPESA
    * @generated
    */
    
    public java.lang.String getIdT_TIPODESPESA(){
        return this.idT_TIPODESPESA;
    }

    /**
    * Define idT_TIPODESPESA
    * @param idT_TIPODESPESA idT_TIPODESPESA
    * @generated
    */
    public DESPESACLASSIFICACAO setIdT_TIPODESPESA(java.lang.String idT_TIPODESPESA){
        this.idT_TIPODESPESA = idT_TIPODESPESA;
        return this;
    }
    /**
    * Obtém flG_SINTETICA
    * return flG_SINTETICA
    * @generated
    */
    
    public java.lang.String getFlG_SINTETICA(){
        return this.flG_SINTETICA;
    }

    /**
    * Define flG_SINTETICA
    * @param flG_SINTETICA flG_SINTETICA
    * @generated
    */
    public DESPESACLASSIFICACAO setFlG_SINTETICA(java.lang.String flG_SINTETICA){
        this.flG_SINTETICA = flG_SINTETICA;
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
    public DESPESACLASSIFICACAO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public DESPESACLASSIFICACAO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém coD_DESPESASUP
    * return coD_DESPESASUP
    * @generated
    */
    
    public DESPESACLASSIFICACAO getCoD_DESPESASUP(){
        return this.coD_DESPESASUP;
    }

    /**
    * Define coD_DESPESASUP
    * @param coD_DESPESASUP coD_DESPESASUP
    * @generated
    */
    public DESPESACLASSIFICACAO setCoD_DESPESASUP(DESPESACLASSIFICACAO coD_DESPESASUP){
        this.coD_DESPESASUP = coD_DESPESASUP;
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
    public DESPESACLASSIFICACAO setId_ANOFISCAL(ANOFISCALENTIDADE id_ANOFISCAL){
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
DESPESACLASSIFICACAO object = (DESPESACLASSIFICACAO)obj;
        if (id_DESPESACLASSIFICACAO != null ? !id_DESPESACLASSIFICACAO.equals(object.id_DESPESACLASSIFICACAO) : object.id_DESPESACLASSIFICACAO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_DESPESACLASSIFICACAO == null) ? 0 : id_DESPESACLASSIFICACAO.hashCode());
        return result;
    }

}