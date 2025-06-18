package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginAdministradorDAO
{

    private Connection con;

    public LoginAdministradorDAO(Connection con) 
{
        this.con = con;
}

    public int registrarAdm(LoginAdministrador logAdm) {
        int status = 0;
        String sql = "insert into loginAdm (usuario, senha) values (?, ?)";

try (PreparedStatement ps = con.prepareStatement(sql)) 
{
            ps.setString(1, logAdm.getUsuario());
            ps.setString(2, logAdm.getSenha());
            status = ps.executeUpdate();
}
catch (SQLException e) 
{
            JOptionPane.showMessageDialog(null, "Erro ao registrar administrador: " + e.getMessage());
            return -1;
}

        return status;
}
}