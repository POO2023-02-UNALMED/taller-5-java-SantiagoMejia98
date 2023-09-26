package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(){}
	
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona zona){
		this.zonas.add(zona);
		zona.setZoo(this);
	}
	public int cantidadTotalAnimales(){
		int a = 0;
		for (Zona zona:zonas){
			a+= zona.cantidadAnimales();
		}
		return a;	
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getUbicacion(){
		return this.ubicacion;
	}
	public ArrayList<Zona> getZona(){
		return zonas;
	}

}