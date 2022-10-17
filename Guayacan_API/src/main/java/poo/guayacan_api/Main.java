
package poo.guayacan_api;
import java.sql.Connection;
public class Main {
     public static void main(String[] args) {
        BD con = new BD();
        //con.connectionMySql();
        //con.GetFuncionario();        
        for (int i = 1;i<7;i++){
        con.dataBaseSelect(i);
            System.out.println(con.var3.get(1));
            System.out.println(con.var2.get(1));
            System.out.println(con.dados_cod.get(1));
            System.out.println(con.Select.get(1));
            con.ArrayClear();
        }
    }
}
