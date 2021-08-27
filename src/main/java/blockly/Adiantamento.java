package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Adiantamento {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Adiantamento
public static Var IncluiFichas() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf(
    Var.valueOf("envia fonte").toString() +
    Var.valueOf("AdiantamentoFichaseDespesas").toString()).getObjectAsString());

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.post"),
    Var.valueOf("AdiantamentoFichaseDespesas"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("AdiantamentoFichaseDespesas"),
    Var.valueOf("true"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

