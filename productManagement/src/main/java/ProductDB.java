
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class ProductDB {

	Connection conn = null;
	
	public ProductDB()  {
		
		try {
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void save(Product p) {
//		 TODO Auto-generated method stub
		String queryString = "insert into product (id, name, warranty, model) values(?,?,?,?)";
		try {
			PreparedStatement statement = conn.prepareStatement(queryString);
			statement.setLong(1, p.getProdId());
			statement.setString(2, p.getName());
			statement.setInt(3, p.getWarranty());
			statement.setString(4, p.getModel());
			statement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		
		String queryString = "select id, name, warranty, model from product";
		try {
			PreparedStatement statement = conn.prepareStatement(queryString);
			
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()){
				
				Product p = new Product();
				p.setProdId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setWarranty(rs.getInt(3));
				p.setModel(rs.getString(4));
				
				products.add(p);				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}

}
