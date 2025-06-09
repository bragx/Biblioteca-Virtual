package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AutenticadorDAO 
{

                private final Connection con;

public AutenticadorDAO(Connection con) 
{
        this.con = con;
}

public String verificarLogin(String usuarioOuEmail, String senha) 
{
try
{
            String sqlAdm = "select * from loginAdm where usuario = ? and senha = ?";
try (PreparedStatement psAdm = con.prepareStatement(sqlAdm)) 
{
                psAdm.setString(1, usuarioOuEmail);
                psAdm.setString(2, senha);
                ResultSet rsAdm = psAdm.executeQuery();
if (rsAdm.next()) 
{
                    return "administrador";
}
}
            String sqlUser = "select * from loginUser where usuario  = ? and senha = ?";
try (PreparedStatement psUser = con.prepareStatement(sqlUser)) 
{
                psUser.setString(1, usuarioOuEmail);
                psUser.setString(2, senha);
                ResultSet rsUser = psUser.executeQuery();
if (rsUser.next())
{
                    return "leitor";
}
}
} 
catch (Exception e)
{
            e.printStackTrace();
          return "erro";
}

        return "nao_encontrado";
}
}