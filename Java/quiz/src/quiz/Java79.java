package quiz;

public class Java79 {
	public static void main(String[] args) {

	}
}

abstract class BaseController{
	protected DatabaseManager dbm;
	protected Table bindedTable;

	public void initialize(){
		dbm = DatabaseManagerFactory.createDbm();
		setTable();
	}

	abstract public void setTable();
}

class RailwayCompanyMasterController extends BaseController{
	@Override
	public void setTable(){
    	this.bindedTable = dbm.getTable("railway_company_tbl");
	}
}

class StationMasterController extends BaseController{
	@Override
	public void setTable() {
		this.bindedTable = dbm.getTable("station_tbl");
	}
}
