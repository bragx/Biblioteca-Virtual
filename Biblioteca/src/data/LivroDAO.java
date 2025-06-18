package data;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LivroDAO 
{
            Connection con;
            PreparedStatement ps;
            ResultSet rs;            
public List<Livro> getLivros() 
{
            List<Livro> livros = new ArrayList<>();
if (conectar()) 
{
try
{
                ps = con.prepareStatement("SELECT * FROM livros");
                rs = ps.executeQuery();
while (rs.next()) 
{
                String nome = rs.getString("titulo");
                String genero = rs.getString("genero");
                String autor = rs.getString("autor");
                String data = rs.getString("dataLancamento");
                livros.add(new Livro(nome, genero, data, autor));
}
}
catch (SQLException e)
{
         JOptionPane.showMessageDialog(null, "Erro ao listar livros: " + e.getMessage());
}
finally
{
        desconectar(); 
}
}
        return livros;
}       
public boolean conectar()
{
try
{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","braga.777");                 
        return true;
}
catch(ClassNotFoundException | SQLException sqle)
{
        JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados: "+ sqle.getMessage());
        return false;
}
}
public int salvar(Livro livro) 
{
        int status = 0;
if (conectar()) 
{
try 
{
        ps = con.prepareStatement("insert into livros  (titulo, genero, dataLancamento, autor) values (? ,? ,? ,?)");
        ps.setString(1, livro.getNome());
        ps.setString(2, livro.getGenero());
        ps.setString(3, livro.getAnoLancamento());
        ps.setString(4, livro.getAutor());
        status = ps.executeUpdate();
}
catch (SQLException ex) 
{
        JOptionPane.showMessageDialog(null, "Erro ao salvar livro: " + ex.getMessage());
}
finally 
{
        desconectar();
}
}
        return status;
}    
 public boolean excluir(String nome)
{
        boolean resultado  = false;
 try 
{
        ps = con.prepareStatement("delete from livros where titulo= ?");
        ps.setString(1, nome);
        ps.executeUpdate();
        resultado =  true;
} 
catch (SQLException sqle) 
 {
       JOptionPane.showMessageDialog(null, "Erro ao excluir livro: " + sqle.getMessage());
}
finally
{
        desconectar();
}
 return resultado;
}    
public void desconectar()
{
try 
{
        con.close();
} 
catch (SQLException ex) 
{
}
}
        public Connection getCon()
{
        return con;
}
        public void setCon(Connection con) 
{
        this.con = con;
}
}