package com.jshop.entity;

// Generated 2013-7-26 22:19:04 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserT generated by hbm2java
 */
@Entity
@Table(name = "user_t", catalog = "jshoper3")
public class UserT implements java.io.Serializable {

	private String userid;
	private String username;
	private String realname;
	private String email;
	private String telno;
	private String mobile;
	private String question;
	private String answer;
	private String password;
	private String userstate;
	private double points;
	private int postingcount;
	private String sex;
	private Date registtime;
	private Date disablebegin;
	private Date disableend;
	private String section;
	private String position;
	private String groupid;
	private String parttime1;
	private String parttime2;
	private String parttime3;
	private String parttime4;
	private String parttime5;
	private String parttime6;
	private String hobby;
	private String qq;
	private String msn;
	private String othercontract;
	private String address;
	private String postcode;
	private String birthday;
	private String grade;
	private Date gradetime;
	private String state;
	private String uid;
	private String gradename;
	private String rolemname;
	private String rolemid;
	private String headpath;

	public UserT() {
	}

	public UserT(String userid, String username, String email, String password,
			String userstate, double points, int postingcount, Date registtime,
			String rolemid, String headpath) {
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.userstate = userstate;
		this.points = points;
		this.postingcount = postingcount;
		this.registtime = registtime;
		this.rolemid = rolemid;
		this.headpath = headpath;
	}

	public UserT(String userid, String username, String realname, String email,
			String telno, String mobile, String question, String answer,
			String password, String userstate, double points, int postingcount,
			String sex, Date registtime, Date disablebegin, Date disableend,
			String section, String position, String groupid, String parttime1,
			String parttime2, String parttime3, String parttime4,
			String parttime5, String parttime6, String hobby, String qq,
			String msn, String othercontract, String address, String postcode,
			String birthday, String grade, Date gradetime, String state,
			String uid, String gradename, String rolemname, String rolemid,
			String headpath) {
		this.userid = userid;
		this.username = username;
		this.realname = realname;
		this.email = email;
		this.telno = telno;
		this.mobile = mobile;
		this.question = question;
		this.answer = answer;
		this.password = password;
		this.userstate = userstate;
		this.points = points;
		this.postingcount = postingcount;
		this.sex = sex;
		this.registtime = registtime;
		this.disablebegin = disablebegin;
		this.disableend = disableend;
		this.section = section;
		this.position = position;
		this.groupid = groupid;
		this.parttime1 = parttime1;
		this.parttime2 = parttime2;
		this.parttime3 = parttime3;
		this.parttime4 = parttime4;
		this.parttime5 = parttime5;
		this.parttime6 = parttime6;
		this.hobby = hobby;
		this.qq = qq;
		this.msn = msn;
		this.othercontract = othercontract;
		this.address = address;
		this.postcode = postcode;
		this.birthday = birthday;
		this.grade = grade;
		this.gradetime = gradetime;
		this.state = state;
		this.uid = uid;
		this.gradename = gradename;
		this.rolemname = rolemname;
		this.rolemid = rolemid;
		this.headpath = headpath;
	}

	@Id
	@Column(name = "USERID", unique = true, nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "REALNAME", length = 50)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "EMAIL", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "TELNO", length = 20)
	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	@Column(name = "MOBILE", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "QUESTION", length = 50)
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Column(name = "ANSWER", length = 50)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Column(name = "PASSWORD", nullable = false, length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USERSTATE", nullable = false, length = 1)
	public String getUserstate() {
		return this.userstate;
	}

	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}

	@Column(name = "POINTS", nullable = false, precision = 10)
	public double getPoints() {
		return this.points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	@Column(name = "POSTINGCOUNT", nullable = false)
	public int getPostingcount() {
		return this.postingcount;
	}

	public void setPostingcount(int postingcount) {
		this.postingcount = postingcount;
	}

	@Column(name = "SEX", length = 2)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REGISTTIME", nullable = false, length = 0)
	public Date getRegisttime() {
		return this.registtime;
	}

	public void setRegisttime(Date registtime) {
		this.registtime = registtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISABLEBEGIN", length = 0)
	public Date getDisablebegin() {
		return this.disablebegin;
	}

	public void setDisablebegin(Date disablebegin) {
		this.disablebegin = disablebegin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DISABLEEND", length = 0)
	public Date getDisableend() {
		return this.disableend;
	}

	public void setDisableend(Date disableend) {
		this.disableend = disableend;
	}

	@Column(name = "SECTION", length = 20)
	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Column(name = "POSITION", length = 20)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "GROUPID", length = 20)
	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	@Column(name = "PARTTIME1", length = 20)
	public String getParttime1() {
		return this.parttime1;
	}

	public void setParttime1(String parttime1) {
		this.parttime1 = parttime1;
	}

	@Column(name = "PARTTIME2", length = 20)
	public String getParttime2() {
		return this.parttime2;
	}

	public void setParttime2(String parttime2) {
		this.parttime2 = parttime2;
	}

	@Column(name = "PARTTIME3", length = 20)
	public String getParttime3() {
		return this.parttime3;
	}

	public void setParttime3(String parttime3) {
		this.parttime3 = parttime3;
	}

	@Column(name = "PARTTIME4", length = 20)
	public String getParttime4() {
		return this.parttime4;
	}

	public void setParttime4(String parttime4) {
		this.parttime4 = parttime4;
	}

	@Column(name = "PARTTIME5", length = 20)
	public String getParttime5() {
		return this.parttime5;
	}

	public void setParttime5(String parttime5) {
		this.parttime5 = parttime5;
	}

	@Column(name = "PARTTIME6", length = 20)
	public String getParttime6() {
		return this.parttime6;
	}

	public void setParttime6(String parttime6) {
		this.parttime6 = parttime6;
	}

	@Column(name = "HOBBY", length = 50)
	public String getHobby() {
		return this.hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Column(name = "QQ", length = 50)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "MSN", length = 50)
	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	@Column(name = "OTHERCONTRACT", length = 50)
	public String getOthercontract() {
		return this.othercontract;
	}

	public void setOthercontract(String othercontract) {
		this.othercontract = othercontract;
	}

	@Column(name = "ADDRESS", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "POSTCODE", length = 20)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "BIRTHDAY", length = 20)
	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Column(name = "GRADE", length = 20)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "GRADETIME", length = 0)
	public Date getGradetime() {
		return this.gradetime;
	}

	public void setGradetime(Date gradetime) {
		this.gradetime = gradetime;
	}

	@Column(name = "STATE", length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "UID", length = 32)
	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Column(name = "GRADENAME", length = 45)
	public String getGradename() {
		return this.gradename;
	}

	public void setGradename(String gradename) {
		this.gradename = gradename;
	}

	@Column(name = "ROLEMNAME", length = 45)
	public String getRolemname() {
		return this.rolemname;
	}

	public void setRolemname(String rolemname) {
		this.rolemname = rolemname;
	}

	@Column(name = "ROLEMID", nullable = false, length = 20)
	public String getRolemid() {
		return this.rolemid;
	}

	public void setRolemid(String rolemid) {
		this.rolemid = rolemid;
	}

	@Column(name = "HEADPATH", nullable = false, length = 225)
	public String getHeadpath() {
		return this.headpath;
	}

	public void setHeadpath(String headpath) {
		this.headpath = headpath;
	}

}
