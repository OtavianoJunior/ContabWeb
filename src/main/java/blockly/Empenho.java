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
 * @return Var
 */
// Empenho
public static Var EsconderGrade() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    if (Var.VAR_FALSE.getObjectAsBoolean()) {
      {}
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

