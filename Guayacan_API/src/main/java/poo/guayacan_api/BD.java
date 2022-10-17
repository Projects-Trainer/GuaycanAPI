package poo.guayacan_api;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class BD {
//FUNCIONAMENTO DO RETORNO DOS DADOS

    /* IRÁ PEGAR OS DADOS E SALVAR EM UMA ARRAY, MAS COMO SABER O TAMANHO DOS DADOS?
            FAZER UMA VERIFICAÇÃO DE QUANTOS DADOS TERÃO E DEPOIS SALVA EM UMA ARRAY INFINITA(3 ARRAYS UMA PARA CADA TIPO DE DADO)
            ASSIM QUE É FEITO O GET  DEPOIS DE PASSADO PARA INTERFACE OS DADOS DA ARRAY SÃO LIMPOS
             
     */
    private String BD[] = {"funcionarios", "projetos", "cliente,orcamento,estoque,produto"};
    private static Connection conexao_MySql = null;
    //Variaveis que serão utilizadas
    ArrayList dados_cod = new ArrayList(); // código do das entradas
    ArrayList var2 = new ArrayList();//valores Strings
    ArrayList var3 = new ArrayList();//valores Strings
    //ArrayList decimal = new ArrayList();//quantidade e preço dos produtos
    ArrayList Select = new ArrayList();//ID de qual banco foi selecionado naquela Select
    /*UTILIZAR O COMANDO:
            dados.add("VALOR");
     */

    //List<String>dados = new ArrayList<String>();
    // local onde o banco de dados está presente. Por padrão, colocarei localhost, mas você
    // pode mudar o local de acordo com sua necessidade.
    private static String localBD = "localhost";

    // Aqui são os LINKS responsáveis pelo local onde o BD estar. é modificável de acordo com suas necessidades
    private static String LINK = "jdbc:mysql://" + localBD + ":3306/guayacan";

    // tem essas alternativas do formato do link caso vc queira usar.
    //private static String LINK1 = "jdbc:mysql://localhost:3306/coloque o nome do bd";
    // Nome do usuário e senha com permissão de acesso ao BD. Você coloque de acordo com o
    // usuário e senha pertencente ao Banco de Dados
    private static final String usuario = "root";
    private static final String senha = "";
    //colocar senai123 se for na rede do senai

    // Método para fazer a conexão com um banco de dados MySql
    public Connection connectionMySql() {

        try {
            // Class.forName("com.mysql.jdbc.Driver");
            conexao_MySql = DriverManager.getConnection(LINK, usuario, senha);
            System.out.println("conexão OK!");
        } catch (SQLException e) {
            throw new RuntimeException("Ocorreu um problema na conexão com o BD", e);
        }
        return conexao_MySql;

    }

    public void ArrayClear() {
        dados_cod.clear();
        var2.clear();
        var3.clear();
        Select.clear();
    }

    public void dataBaseInsert(String var1, String var2, String var3, int flag) {
      try {
        /*if (var1.length != var2.length && var2.length != var3.length) {
            int num = var1.length;
        }*/
        Connection connection = connectionMySql();
        String func = "insert into funcionario (cod_proj ,data_inicio, data_entrega) values (null,?,?)";
        String Estq = "insert into estoque(cod_estoque, disponibilidade, quantidade) values (null,?,?)";
        String Orc = "insert into orcamento (cod_orcamento, data_orcamento, valor_orcamento)";
        String Prod = "insert into produto(cod_produto, nome_produto, preco_produto) values (null,?,?)";
        String Cli = "insert into cliente(nome, endereco, cpf) values (?,?,?)";
        String Proj = "insert into projetos(cod_proj, data_inicio, data_entrega) values (null,?,?)";
        boolean result = false;
        PreparedStatement preparedStmt;
       
            switch (flag) {
                case 1:
                    preparedStmt = connection.prepareStatement(func);
                    preparedStmt.setString(1,var2);
                    preparedStmt.setString(2,var3);
                    result = preparedStmt.execute();
                    break;
                case 2:
                    preparedStmt = connection.prepareStatement(Estq);
                    if (var1.equals("1")){
                        preparedStmt.setBoolean(1,true);
                    } else preparedStmt.setBoolean(1,false);
                    preparedStmt.setString(2,var2);
                    result = preparedStmt.execute();
                    break;
                case 3:
                    preparedStmt = connection.prepareStatement(Orc);
                    preparedStmt.setString(1,var1);
                    preparedStmt.setString(2,var2);
                    result = preparedStmt.execute();
                    break;
                case 4:
                    preparedStmt = connection.prepareStatement(Prod);
                    preparedStmt.setString(1,var1);
                    float arr = Float. valueOf(var2);
                    preparedStmt.setFloat(2,arr);
                    result = preparedStmt.execute();
                    break;
                case 5:
                    preparedStmt = connection.prepareStatement(Cli);
                    preparedStmt.setString(1,var3);
                    preparedStmt.setString(2,var1);
                    preparedStmt.setString(3,var2);
                    result = preparedStmt.execute();
                    break;
                case 6:
                    preparedStmt = connection.prepareStatement(Proj);
                    preparedStmt.setString(2,var1);
                    preparedStmt.setString(3,var2);
                    result = preparedStmt.execute();
                    break;
                default:
                    break;
            }
            
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteTable(String Del,int num){
      try{    
           boolean result = false;
        Connection connection = connectionMySql();
          String[] Dados = new String[]{"","funcionarios", "estoque", "orcamento", "produto", "Cliente","projetos"};
          String[] id = new String[]{"","nome","cod_estoque","data_orcamento","nome_produto","endereco","data_inicio"};
          String del = "delete from "+Dados[num]+ " where "+id[num]+" = "+"\""+Del+"\""+" ;";
          PreparedStatement preparedStmt;
          preparedStmt = connection.prepareStatement(del);
          result = preparedStmt.execute();
      }
           catch (SQLException e){
            e.printStackTrace();
        }
         }
    public boolean TesteCon() {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            conexao_MySql = DriverManager.getConnection(LINK, usuario, senha);
        } catch (SQLException e) {

            throw new RuntimeException("Ocorreu um problema na conexão com o BD", e);
        }
        return true;
    }

    public void dataBaseSelect(int num) {

        Connection connection = connectionMySql();

        String func = "Select cod_func, nome, funcao_func from funcionarios;";
        String Estq = "Select cod_estoque, disponibilidade, quantidade from estoque;";
        String Orcamento = "Select cod_orcamento, data_orcamento, valor_orcamento from orcamento;";
        String Prod = "Select cod_produto, nome_produto, preco_produto from produto;";
        String Cli = "Select nome, endereco, cpf from Cliente;";
        String Proj = "Select cod_proj, data_inicio, data_entrega from projetos;";
        PreparedStatement preparedStmt;
        try {
            switch (num) {
                case 1:
                    preparedStmt = connection.prepareStatement(func);
                    break;
                case 2:
                    preparedStmt = connection.prepareStatement(Estq);
                    break;
                case 3:
                    preparedStmt = connection.prepareStatement(Orcamento);
                    break;
                case 4:
                    preparedStmt = connection.prepareStatement(Prod);
                    break;
                case 5:
                    preparedStmt = connection.prepareStatement(Cli);
                    break;
                default:
                    preparedStmt = connection.prepareStatement(Proj);
                    break;

            }
            //Efetua a troca do '?' pelos valores na query
            //preparedStmt.setInt(1, 0);
            //precisa de uma matriz??, switch case talvez não funcione nessa caso

            //  System.out.println(preparedStmt);
            ResultSet result = preparedStmt.executeQuery();

            //valida resultado
            while (result.next()) {
                switch (num) {
                    case 1://funcionários
                        dados_cod.add(result.getInt("cod_func"));
                        var2.add(result.getString("nome"));
                        var3.add(result.getString("funcao_func"));
                        Select.add(1);
                        break;

                    case 2://Estoque
                        String dad1 = Integer.toString(result.getInt("cod_estoque"));
                        String dad2 = result.getString("disponibilidade");
                        String dad3 = result.getString("quantidade");

                        dados_cod.add(dad1);
                        var2.add(dad2);
                        var3.add(dad3);
                        Select.add(2);
                        break;

                    case 3://Orçamento
                        dados_cod.add(result.getInt("cod_orcamento"));
                        var2.add(result.getString("data_orcamento"));
                        var3.add(result.getString("valor_orcamento"));
                        Select.add(3);
                        break;

                    case 4://Produto
                        dados_cod.add(result.getInt("cod_produto"));
                        var2.add(result.getString("nome_produto"));
                        var3.add(result.getString("preco_produto"));
                        Select.add(4);
                        break;

                    case 5://CLiente
                        dados_cod.add(result.getString("nome"));
                        var2.add(result.getString("endereco"));
                        var3.add(result.getString("cpf"));
                        Select.add(5);
                        break;

                    default://Projeto
                        if (num == 6) {
                            dados_cod.add(result.getInt("cod_proj"));
                            var2.add(result.getString("data_inicio"));
                            var3.add(result.getString("data_entrega"));
                            Select.add(6);
                        } else {
                            Select.add("ERROR");
                        }
                        // System.out.println(dados_cod.get(dados_cod.size()-1));
                        //PEGAR O ULTIMO VALOR SALVO
                        break;

                }
            }
            /*IMPRESSÃO DE VALORES
                        System.out.println(dados_cod);
                        System.out.println(var2);
                        System.out.println(var3);
                        System.out.println(Select);*/

            connection.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
