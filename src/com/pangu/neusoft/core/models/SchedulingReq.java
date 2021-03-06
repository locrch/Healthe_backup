package com.pangu.neusoft.core.models;


import java.util.Hashtable;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class SchedulingReq implements KvmSerializable {

	private String HospitalId;
	public String getHospitalId() { 
		return HospitalId;
	}

	public void setHospitalId(String HospitalId) { 
		this.HospitalId = HospitalId;
	}

	private String DepartmentId;
	public String getDepartmentId() { 
		return DepartmentId;
	}

	public void setDepartmentId(String DepartmentId) { 
		this.DepartmentId = DepartmentId;
	}

	private String DoctorId;
	public String getDoctorId() { 
		return DoctorId;
	}

	public void setDoctorId(String DoctorId) { 
		this.DoctorId = DoctorId;
	}

	private String BeginDate;
	public String getBeginDate() { 
		return BeginDate;
	}

	public void setBeginDate(String BeginDate) { 
		this.BeginDate = BeginDate;
	}

	private String EndDate;
	public String getEndDate() { 
		return EndDate;
	}

	public void setEndDate(String EndDate) { 
		this.EndDate = EndDate;
	}

	private String Aucode;
	public String getAucode() { 
		return Aucode;
	}

	public void setAucode(String Aucode) { 
		this.Aucode = Aucode;
	}

	@Override
	public Object getProperty(int arg0) { 
		switch(arg0) {
			case 0:
				return HospitalId;
			case 1:
				return DepartmentId;
			case 2:
				return DoctorId;
			case 3:
				return BeginDate;
			case 4:
				return EndDate;
			case 5:
				return Aucode;
		}
		return null;
	}

	@Override
	public int getPropertyCount() {
		return 6;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable arg1, PropertyInfo info) {
		switch (index) {
			case 0:
				info.type = PropertyInfo.STRING_CLASS;
			info.name = "HospitalId";
			break;
			case 1:
				info.type = PropertyInfo.STRING_CLASS;
			info.name = "DepartmentId";
			break;
			case 2:
				info.type = PropertyInfo.STRING_CLASS;
			info.name = "DoctorId";
			break;
			case 3:
				info.type = PropertyInfo.STRING_CLASS;
			info.name = "BeginDate";
			break;
			case 4:
				info.type = PropertyInfo.STRING_CLASS;
			info.name = "EndDate";
			break;
			case 5:
				info.type = PropertyInfo.STRING_CLASS;
			info.name = "Aucode";
			break;
			default:
				break;
		}
	}

	@Override
	public void setProperty(int index, Object value) {
		switch (index) {
			case 0:
				HospitalId = value.toString();
			break;
			case 1:
				DepartmentId = value.toString();
			break;
			case 2:
				DoctorId = value.toString();
			break;
			case 3:
				BeginDate = value.toString();
			break;
			case 4:
				EndDate = value.toString();
			break;
			case 5:
				Aucode = value.toString();
			break;
			default:
				break;
		}
	}

}
