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

   public Var call() throws Exception {
    return
cronapi.dateTime.Operations.getNow();
   }
 }.call();
}

}

