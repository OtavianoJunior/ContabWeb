package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ChamarEmpenho {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// teste
public static Var ChamarEmpenho() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/home/Cadastros/empenhoadiantamento"), cronapi.list.Operations.newList(Var.valueOf("id_adto",
    Var.VAR_TRUE),Var.valueOf("nro_serieempenho",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_id_ANOFISCAL"))),Var.valueOf("nro_cuc",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_nrO_CUC"))),Var.valueOf("vlr_empenho",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.vlR_CONCEDIDOFONTE"))),Var.valueOf("dat_empenho",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_daT_ADIANTAMENTO"))),Var.valueOf("seq_despesaorcamento",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.seQ_DESPESAORCAMENTO"))),Var.valueOf("id_despesaclassificacao",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_DESPESACLASSIFICACAO"))),Var.valueOf("id_adiantamento",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO"))),Var.valueOf("cod_ficha",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.seQ_DESPESAORCAMENTO_coD_FICHA"))),Var.valueOf("nro_cgc",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_nrO_CUC_nrO_CGC"))),Var.valueOf("nro_adto",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_nrO_ADIANTAMENTO"))),Var.valueOf("cod_despesa",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_DESPESACLASSIFICACAO_coD_DESPESA")))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void EmpenharAdiatamento() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/home/Cadastros/empenhoadiantamento"), cronapi.list.Operations.newList(Var.valueOf("id_adto",
    Var.VAR_TRUE),Var.valueOf("nro_serieempenho",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_id_ANOFISCAL"))),Var.valueOf("nro_cuc",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_nrO_CUC"))),Var.valueOf("vlr_empenho",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.vlR_CONCEDIDOFONTE"))),Var.valueOf("dat_empenho",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_daT_ADIANTAMENTO"))),Var.valueOf("seq_despesaorcamento",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.seQ_DESPESAORCAMENTO"))),Var.valueOf("id_despesaclassificacao",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_DESPESACLASSIFICACAO"))),Var.valueOf("id_adiantamento",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO"))),Var.valueOf("cod_ficha",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.seQ_DESPESAORCAMENTO_coD_FICHA"))),Var.valueOf("nro_cgc",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_nrO_CUC_nrO_CGC"))),Var.valueOf("nro_adto",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_ADIANTAMENTO_nrO_ADIANTAMENTO"))),Var.valueOf("cod_despesa",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("AdiantamentoFichaIntegracao.active.id_DESPESACLASSIFICACAO_coD_DESPESA")))));
   return Var.VAR_NULL;
   }
 }.call();
}

}

