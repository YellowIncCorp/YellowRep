package Domain;

import java.sql.Date;

public class Inquiry {
	private int _id;
	private Date _date;
	private String _location_;
	private double _m_speed;
	private double _speed;
	private String _license;

	
	public Inquiry(String aLicense, String aLocation, double aM_speed, double a_speed) {
		throw new UnsupportedOperationException();
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public Date get_date() {
		return _date;
	}

	public void set_date(Date _date) {
		this._date = _date;
	}

	public String get_location_() {
		return _location_;
	}

	public void set_location_(String _location_) {
		this._location_ = _location_;
	}

	public double get_m_speed() {
		return _m_speed;
	}

	public void set_m_speed(double _m_speed) {
		this._m_speed = _m_speed;
	}

	public double get__speed() {
		return _speed;
	}

	public void set__speed(double __speed) {
		this._speed = __speed;
	}

	public String get_license() {
		return _license;
	}

	public void set_license(String _license) {
		this._license = _license;
	}

	public void findOwner(String aLicense) {
		throw new UnsupportedOperationException();
	}
	
}