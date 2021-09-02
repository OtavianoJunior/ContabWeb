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

    cronapi.database.Operations.insert(Var.valueOf("app.entity.EMPENHO"),Var.valueOf("id_DESPESACLASSIFICACAO",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Integracao.active.id_DESPESACLASSIFICACAO"))),Var.valueOf("nrO_CUC",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Integracao.active.nrO_CUC"))),Var.valueOf("id_ANOFISCAL",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Integracao.active.id_ANOFISCAL"))),Var.valueOf("daT_EMPENHO",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Integracao.active.daT_ADIANTAMENTO"))),Var.valueOf("vlR_EMPENHO",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Integracao.active.vlR_CONCEDIDOFONTE"))),Var.valueOf("id_ADIANTAMENTO",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Integracao.active.id_ADIANTAMENTO"))),Var.valueOf("seQ_DESPESAORCAMENTO",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Integracao.active.seQ_DESPESAORCAMENTO"))));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/home/Cadastros/empenho"), cronapi.list.Operations.newList(Var.valueOf("params.EMPENHO.inserting",
    Var.VAR_TRUE)));
    return Var.VAR_NULL;
   }
 }.call();
}

}

