public class LocalDAO {

private Connection conn;

@Autowired
public LocalDAO(DataSource dataSource) throws IOException{

	try{

		this.conn = dataSource.getConnection();

		} catch (SQLException e){

	throw new IOException(e);

		}

}

public void excluir(Local local) throws IOException {

String sqlDelete = "delete from local where idlocal=?";
	try (PreparedStatement pst = conn.prepareStatement(sqlDelete);) {

		pst.setInt(1, local.getId());
		pst.execute();

	} catch (SQLException e) {
		e.printStackTrace();
		throw new IOException(e);

	}

}