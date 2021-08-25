package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TipoAdiantamento {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// TipoAdiantamento
public static Var CarregarDescricaoConta() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("PCA_SUBTIPOADIANTAMENTO.active.deS_SUBTIPOADIANTAMENTO")),
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("PCA_PLANOCONTAS.active.deS_CONTA")));

    System.out.println(
    Var.valueOf(
    Var.valueOf("descrição - ").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("PCA_PLANOCONTAS.active.deS_CONTA")).toString()).getObjectAsString());
    return
cronapi.screen.Operations.getValueOfField(
Var.valueOf("PCA_PLANOCONTAS.active.deS_CONTA"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ExcluiSubtipos() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var subtipo = Var.VAR_NULL;
   private Var sql = Var.VAR_NULL;

   public Var call() throws Exception {

    item =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("PCA_TIPOADIANTAMENTO.active.id_TIPOADIANTAMENTO"));

    subtipo =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("PCA_SUBTIPOADIANTAMENTO.active.id_TIPOADIANTAMENTO"));

    System.out.println(
    Var.valueOf(
    Var.valueOf("id tipo = ").toString() +
    item.toString() +
    Var.valueOf("id subtipo = ").toString() +
    subtipo.toString()).getObjectAsString());

    System.out.println(
    Var.valueOf(
    Var.valueOf("ID_TIPOADIANTAMENTO").toString() +
    Var.valueOf("=").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("PCA_TIPOADIANTAMENTO.active.id_TIPOADIANTAMENTO")).toString()).getObjectAsString());

    sql =
    Var.valueOf(
    Var.valueOf("id_TIPOADIANTAMENTO").toString() +
    Var.valueOf(" eq \'").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("PCA_TIPOADIANTAMENTO.active.id_TIPOADIANTAMENTO")).toString() +
    Var.valueOf("\'").toString());

    cronapi.database.Operations.execute(Var.valueOf("app.entity.PCA_SUBTIPOADIANTAMENTO"), Var.valueOf("delete from PCA_SUBTIPOADIANTAMENTO where id_TIPOADIANTAMENTO = :tipoadiantamento"),Var.valueOf("tipoadiantamento",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("PCA_TIPOADIANTAMENTO.active.id_TIPOADIANTAMENTO"))));
    return Var.VAR_NULL;
   }
 }.call();
}

}

