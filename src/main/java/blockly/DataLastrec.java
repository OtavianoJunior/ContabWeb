package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DataLastrec {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// DataLastrec
public static Var DataLastrec() throws Exception {
 return new Callable<Var>() {

   private Var dataHora = Var.VAR_NULL;

   public Var call() throws Exception {

    dataHora =
    cronapi.dateTime.Operations.formatDateTime(
    cronapi.dateTime.Operations.getNow(),
    Var.valueOf(""),
    Var.valueOf(-3));
    return dataHora;
   }
 }.call();
}

}

