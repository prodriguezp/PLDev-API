package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Proyecto implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String titulo;
	
	@Column(length = 10000)
	private String descripcion;
	
	@Column
	private String img;
	
	
	public Proyecto() {
		// TODO Auto-generated constructor stub
	}


	public Proyecto(long id, String titulo, String descripcion, String img) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.img = img;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}
	
	
	@Override
	public String toString() {	
		return "PROYECTO = [id="+id+",  titulo="+titulo+", descripcion="+descripcion+",  img="+img+"]";
	}
	
}
