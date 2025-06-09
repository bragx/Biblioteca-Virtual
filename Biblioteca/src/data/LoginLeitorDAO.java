package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginLeitorDAO
{

    private Connection con;

    public LoginLeitorDAO(Connection con) 
{
        this.con = con;
}

    public int registrarUser(LoginLeitor logUser) {
        int status = 0;
        String sql = "insert into loginUser (email, usuario, senha ) values (?, ?, ?)";

try (PreparedStatement ps = con.prepareStatement(sql)) 
{
            ps.setString(1, logUser.getEmail());
            ps.setString(2, logUser.getUsuario());
            ps.setString(3, logUser.getSenha());
            status = ps.executeUpdate();
}
catch (SQLException e) 
{
            JOptionPane.showMessageDialog(null, "Erro ao registrar leitor: " + e.getMessage());
            return -1;
}

        return status;
}
}