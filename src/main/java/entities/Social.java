package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Social implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String red;
	
	@Column()
	private String link;
	
	@Column
	private String img;
	
	
	public Social() {
		// TODO Auto-generated constructor stub
	}


	public Social(Long id, String red, String link, String img) {
		super();
		this.id = id;
		this.red = red;
		this.link = link;
		this.img = img;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRed() {
		return red;
	}


	public void setRed(String red) {
		this.red = red;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {	
		return "SOCIAL [id="+id+",  red="+red+",  link="+link+",  img="+img+"]";
	}
}
