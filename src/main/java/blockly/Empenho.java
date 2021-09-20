package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Empenho {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Empenho
public static Var EsconderGrade(@ParamMetaData(description = "params_id_adto") Var params_id_adto, @ParamMetaData(description = "params_nro_serieempenho") Var params_nro_serieempenho, @ParamMetaData(description = "params_nro_cuc") Var params_nro_cuc, @ParamMetaData(description = "params_dat_empenho") Var params_dat_empenho, @ParamMetaData(description = "params_seq_despesaorcamento") Var params_seq_despesaorcamento, @ParamMetaData(description = "params_id_despesaclassificacao") Var params_id_despesaclassificacao, @ParamMetaData(description = "params_id_adiantamento") Var params_id_adiantamento, @ParamMetaData(description = "params_vlr_empenho") Var params_vlr_empenho, @ParamMetaData(description = "params_cod_ficha") Var params_cod_ficha, @ParamMetaData(description = "params_nro_cgc") Var params_nro_cgc, @ParamMetaData(description = "params_nro_adto") Var params_nro_adto, @ParamMetaData(description = "params_cod_despesa") Var params_cod_despesa, @ParamMetaData(description = "params_des_empenho") Var params_des_empenho) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("params.id_adto")).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.startEditingMode"),
        Var.valueOf("EMPENHO"));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.id_ANOFISCAL"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.nro_serieempenho")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("NrO_CUCCombo.active.nrO_CGC"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.nro_cgc")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.nrO_CUC"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.nro_cuc")));

        System.out.println(
        Var.valueOf(
        Var.valueOf("apos carga cuc  emp= ").toString() +
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("EMPENHO.active.nrO_CUC")).toString() +
        Var.valueOf("apos carga cuc param= ").toString() +
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.nro_cuc")).toString()).getObjectAsString());

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.vlR_EMPENHO"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.vlr_empenho")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.daT_EMPENHO"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.dat_empenho")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.seQ_DESPESAORCAMENTO"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.seq_despesaorcamento")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.id_DESPESACLASSIFICACAO"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.id_despesaclassificacao")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.id_ADIANTAMENTO"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.id_adiantamento")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("SeQ_DESPESAORCAMENTOCombo.active.coD_FICHA"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.cod_ficha")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("Id_ADIANTAMENTOCombo.active.nrO_ADIANTAMENTO"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.nro_adto")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.id_DESPESACLASSIFICACAO_coD_DESPESA"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.cod_despesa")));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("EMPENHO.active.deS_EMPEMHO"),
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("params.des_empenho")));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

