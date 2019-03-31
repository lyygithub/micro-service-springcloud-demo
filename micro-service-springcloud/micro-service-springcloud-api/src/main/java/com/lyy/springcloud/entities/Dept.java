package com.lyy.springcloud.entities;

import java.io.Serializable;
import lombok.experimental.Accessors;
@Accessors(chain=true)
public class Dept implements Serializable {
	
	  /**
	 * 
	 */
	  private static final long serialVersionUID = 1L;
	  private Long  deptno;   //主键
	  private String  dname;   //部门名称
	  private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	  
	  
	  Dept(){
	  
	  }
	  public Dept(String dname)
	  {
	   super();
	   this.setDname(dname);
	  }
	  
	  public Dept(Long deptno,String dname,String db_source)
	  {
	   super();
	   this.setDname(dname);
	   this.setDeptno(deptno);
	   this.setDb_source(db_source);
	   
	  }

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * @return the db_source
	 */
	public String getDb_source() {
		return db_source;
	}

	/**
	 * @param db_source the db_source to set
	 */
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
}
