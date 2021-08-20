package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PCA_ADIANTAMENTOFICHAS
* @generated
*/
@Entity
@Table(name = "\"PCA_ADIANTAMENTOFICHAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PCA_ADIANTAMENTOFICHAS")
public class PCA_ADIANTAMENTOFICHAS implements Serializable {

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
    @Column(name = "ID_ADIANTAMENTOFICHA", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_ADIANTAMENTOFICHA;

    /**
    * @generated
    */
    @Column(name = "VLR_CONCEDIDOFONTE", nullable = true, unique = false, length=18, precision=2, insertable=true, updatable=true)
        
        private java.lang.Double vlR_CONCEDIDOFONTE;

    /**
    * @generated
    */
    @Column(name = "FLG_REJEITADO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_REJEITADO;

    /**
    * @generated
    */
    @Column(name = "DES_HISTORICOREJEICAO", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_HISTORICOREJEICAO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_APROVACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_APROVACAO;

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
    @JoinColumn(name="ID_PCA_ADIANTAMENTO", nullable = true, referencedColumnName = "ID_ADIANTAMENTO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PCA_ADIANTAMENTO id_ADIANTAMENTO;

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
    @JoinColumn(name="ID_FONTERECURSO", nullable = true, referencedColumnName = "ID_FONTERECURSO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private FONTERECURSO id_FONTERECURSO;

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
    public PCA_ADIANTAMENTOFICHAS(){
    }

    /**
    * Obtém id_ADIANTAMENTOFICHA
    * return id_ADIANTAMENTOFICHA
    * @generated
    */
    
    public java.lang.Integer getId_ADIANTAMENTOFICHA(){
        return this.id_ADIANTAMENTOFICHA;
    }

    /**
    * Define id_ADIANTAMENTOFICHA
    * @param id_ADIANTAMENTOFICHA id_ADIANTAMENTOFICHA
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setId_ADIANTAMENTOFICHA(java.lang.Integer id_ADIANTAMENTOFICHA){
        this.id_ADIANTAMENTOFICHA = id_ADIANTAMENTOFICHA;
        return this;
    }
    /**
    * Obtém vlR_CONCEDIDOFONTE
    * return vlR_CONCEDIDOFONTE
    * @generated
    */
    
    public java.lang.Double getVlR_CONCEDIDOFONTE(){
        return this.vlR_CONCEDIDOFONTE;
    }

    /**
    * Define vlR_CONCEDIDOFONTE
    * @param vlR_CONCEDIDOFONTE vlR_CONCEDIDOFONTE
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setVlR_CONCEDIDOFONTE(java.lang.Double vlR_CONCEDIDOFONTE){
        this.vlR_CONCEDIDOFONTE = vlR_CONCEDIDOFONTE;
        return this;
    }
    /**
    * Obtém flG_REJEITADO
    * return flG_REJEITADO
    * @generated
    */
    
    public java.lang.String getFlG_REJEITADO(){
        return this.flG_REJEITADO;
    }

    /**
    * Define flG_REJEITADO
    * @param flG_REJEITADO flG_REJEITADO
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setFlG_REJEITADO(java.lang.String flG_REJEITADO){
        this.flG_REJEITADO = flG_REJEITADO;
        return this;
    }
    /**
    * Obtém deS_HISTORICOREJEICAO
    * return deS_HISTORICOREJEICAO
    * @generated
    */
    
    public java.lang.String getDeS_HISTORICOREJEICAO(){
        return this.deS_HISTORICOREJEICAO;
    }

    /**
    * Define deS_HISTORICOREJEICAO
    * @param deS_HISTORICOREJEICAO deS_HISTORICOREJEICAO
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setDeS_HISTORICOREJEICAO(java.lang.String deS_HISTORICOREJEICAO){
        this.deS_HISTORICOREJEICAO = deS_HISTORICOREJEICAO;
        return this;
    }
    /**
    * Obtém daT_APROVACAO
    * return daT_APROVACAO
    * @generated
    */
    
    public java.util.Date getDaT_APROVACAO(){
        return this.daT_APROVACAO;
    }

    /**
    * Define daT_APROVACAO
    * @param daT_APROVACAO daT_APROVACAO
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setDaT_APROVACAO(java.util.Date daT_APROVACAO){
        this.daT_APROVACAO = daT_APROVACAO;
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
    public PCA_ADIANTAMENTOFICHAS setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PCA_ADIANTAMENTOFICHAS setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
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
    public PCA_ADIANTAMENTOFICHAS setId_ADIANTAMENTO(PCA_ADIANTAMENTO id_ADIANTAMENTO){
        this.id_ADIANTAMENTO = id_ADIANTAMENTO;
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
    public PCA_ADIANTAMENTOFICHAS setId_DESPESACLASSIFICACAO(DESPESACLASSIFICACAO id_DESPESACLASSIFICACAO){
        this.id_DESPESACLASSIFICACAO = id_DESPESACLASSIFICACAO;
        return this;
    }
    /**
    * Obtém id_FONTERECURSO
    * return id_FONTERECURSO
    * @generated
    */
    
    public FONTERECURSO getId_FONTERECURSO(){
        return this.id_FONTERECURSO;
    }

    /**
    * Define id_FONTERECURSO
    * @param id_FONTERECURSO id_FONTERECURSO
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setId_FONTERECURSO(FONTERECURSO id_FONTERECURSO){
        this.id_FONTERECURSO = id_FONTERECURSO;
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
    public PCA_ADIANTAMENTOFICHAS setSeQ_DESPESAORCAMENTO(DESPESAORCAMENTO seQ_DESPESAORCAMENTO){
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
PCA_ADIANTAMENTOFICHAS object = (PCA_ADIANTAMENTOFICHAS)obj;
        if (id_ADIANTAMENTOFICHA != null ? !id_ADIANTAMENTOFICHA.equals(object.id_ADIANTAMENTOFICHA) : object.id_ADIANTAMENTOFICHA != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_ADIANTAMENTOFICHA == null) ? 0 : id_ADIANTAMENTOFICHA.hashCode());
        return result;
    }

}