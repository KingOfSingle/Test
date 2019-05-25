package beans;

public class TestBoard {
	private String OBJ_ID;
	private String OBJ_CODE;
	private String OBJ_CODE_NM;
	private String REG_DATE;
	private String REG_USER;
	
	public TestBoard() {
		super();
	}

	public TestBoard(String oBJ_ID, String oBJ_CODE, String oBJ_CODE_NM, String rEG_DATE, String rEG_USER) {
		super();
		OBJ_ID = oBJ_ID;
		OBJ_CODE = oBJ_CODE;
		OBJ_CODE_NM = oBJ_CODE_NM;
		REG_DATE = rEG_DATE;
		REG_USER = rEG_USER;
	}

	public String getOBJ_ID() {
		return OBJ_ID;
	}

	public void setOBJ_ID(String oBJ_ID) {
		OBJ_ID = oBJ_ID;
	}

	public String getOBJ_CODE() {
		return OBJ_CODE;
	}

	public void setOBJ_CODE(String oBJ_CODE) {
		OBJ_CODE = oBJ_CODE;
	}

	public String getOBJ_CODE_NM() {
		return OBJ_CODE_NM;
	}

	public void setOBJ_CODE_NM(String oBJ_CODE_NM) {
		OBJ_CODE_NM = oBJ_CODE_NM;
	}

	public String getREG_DATE() {
		return REG_DATE;
	}

	public void setREG_DATE(String rEG_DATE) {
		REG_DATE = rEG_DATE;
	}

	public String getREG_USER() {
		return REG_USER;
	}

	public void setREG_USER(String rEG_USER) {
		REG_USER = rEG_USER;
	}
	
	
	
	
}
