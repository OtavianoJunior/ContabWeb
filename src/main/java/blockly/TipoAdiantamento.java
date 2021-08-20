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

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.removeRecord"),
    Var.valueOf("PCA_SUBTIPOADIANTAMENTO"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

