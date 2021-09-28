package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela FONTERECURSO
* @generated
*/
@Entity
@Table(name = "\"FONTERECURSO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.FONTERECURSO")
public class FONTERECURSO implements Serializable {

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
    @Column(name = "ID_FONTERECURSO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_FONTERECURSO;

    /**
    * @generated
    */
    @Column(name = "COD_FONTERECURSO", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String coD_FONTERECURSO;

    /**
    * @generated
    */
    @Column(name = "DES_FONTERECURSO", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deS_FONTERECURSO;

    /**
    * @generated
    */
    @Column(name = "CODIGO_FONTESEMMASCARA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String coD_FONTESEMMASCARA;

    /**
    * @generated
    */
    @Column(name = "IDT_TIPORECURSO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String idT_TIPORECURSO;

    /**
    * @generated
    */
    @Column(name = "FLG_SINTETICA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_SINTETICA;

    /**
    * @generated
    */
    @Column(name = "FLG_SICOM", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_SICOM;

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
    @JoinColumn(name="ID_ANOFISCAL", nullable = true, referencedColumnName = "ID_ANOFISCAL", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ANOFISCALENTIDADE id_ANOFISCAL;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_FONTERECURSO_0", nullable = true, referencedColumnName = "ID_FONTERECURSO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private FONTERECURSO id_FONTERECURSOSUP;

    /**
    * Construtor
    * @generated
    */
    public FONTERECURSO(){
    }

    /**
    * Obtém id_FONTERECURSO
    * return id_FONTERECURSO
    * @generated
    */
    
    public java.lang.Integer getId_FONTERECURSO(){
        return this.id_FONTERECURSO;
    }

    /**
    * Define id_FONTERECURSO
    * @param id_FONTERECURSO id_FONTERECURSO
    * @generated
    */
    public FONTERECURSO setId_FONTERECURSO(java.lang.Integer id_FONTERECURSO){
        this.id_FONTERECURSO = id_FONTERECURSO;
        return this;
    }
    /**
    * Obtém coD_FONTERECURSO
    * return coD_FONTERECURSO
    * @generated
    */
    
    public java.lang.String getCoD_FONTERECURSO(){
        return this.coD_FONTERECURSO;
    }

    /**
    * Define coD_FONTERECURSO
    * @param coD_FONTERECURSO coD_FONTERECURSO
    * @generated
    */
    public FONTERECURSO setCoD_FONTERECURSO(java.lang.String coD_FONTERECURSO){
        this.coD_FONTERECURSO = coD_FONTERECURSO;
        return this;
    }
    /**
    * Obtém deS_FONTERECURSO
    * return deS_FONTERECURSO
    * @generated
    */
    
    public java.lang.String getDeS_FONTERECURSO(){
        return this.deS_FONTERECURSO;
    }

    /**
    * Define deS_FONTERECURSO
    * @param deS_FONTERECURSO deS_FONTERECURSO
    * @generated
    */
    public FONTERECURSO setDeS_FONTERECURSO(java.lang.String deS_FONTERECURSO){
        this.deS_FONTERECURSO = deS_FONTERECURSO;
        return this;
    }
    /**
    * Obtém coD_FONTESEMMASCARA
    * return coD_FONTESEMMASCARA
    * @generated
    */
    
    public java.lang.String getCoD_FONTESEMMASCARA(){
        return this.coD_FONTESEMMASCARA;
    }

    /**
    * Define coD_FONTESEMMASCARA
    * @param coD_FONTESEMMASCARA coD_FONTESEMMASCARA
    * @generated
    */
    public FONTERECURSO setCoD_FONTESEMMASCARA(java.lang.String coD_FONTESEMMASCARA){
        this.coD_FONTESEMMASCARA = coD_FONTESEMMASCARA;
        return this;
    }
    /**
    * Obtém idT_TIPORECURSO
    * return idT_TIPORECURSO
    * @generated
    */
    
    public java.lang.String getIdT_TIPORECURSO(){
        return this.idT_TIPORECURSO;
    }

    /**
    * Define idT_TIPORECURSO
    * @param idT_TIPORECURSO idT_TIPORECURSO
    * @generated
    */
    public FONTERECURSO setIdT_TIPORECURSO(java.lang.String idT_TIPORECURSO){
        this.idT_TIPORECURSO = idT_TIPORECURSO;
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
    public FONTERECURSO setFlG_SINTETICA(java.lang.String flG_SINTETICA){
        this.flG_SINTETICA = flG_SINTETICA;
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
    public FONTERECURSO setFlG_SICOM(java.lang.String flG_SICOM){
        this.flG_SICOM = flG_SICOM;
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
    public FONTERECURSO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public FONTERECURSO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
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
    public FONTERECURSO setId_ANOFISCAL(ANOFISCALENTIDADE id_ANOFISCAL){
        this.id_ANOFISCAL = id_ANOFISCAL;
        return this;
    }
    /**
    * Obtém id_FONTERECURSOSUP
    * return id_FONTERECURSOSUP
    * @generated
    */
    
    public FONTERECURSO getId_FONTERECURSOSUP(){
        return this.id_FONTERECURSOSUP;
    }

    /**
    * Define id_FONTERECURSOSUP
    * @param id_FONTERECURSOSUP id_FONTERECURSOSUP
    * @generated
    */
    public FONTERECURSO setId_FONTERECURSOSUP(FONTERECURSO id_FONTERECURSOSUP){
        this.id_FONTERECURSOSUP = id_FONTERECURSOSUP;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
FONTERECURSO object = (FONTERECURSO)obj;
        if (id_FONTERECURSO != null ? !id_FONTERECURSO.equals(object.id_FONTERECURSO) : object.id_FONTERECURSO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_FONTERECURSO == null) ? 0 : id_FONTERECURSO.hashCode());
        return result;
    }

}