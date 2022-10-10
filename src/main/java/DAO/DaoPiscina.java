/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Piscina;
import java.util.ArrayList;


public class DaoPiscina {
    
    private static ArrayList<Piscina> lista;

    private DaoPiscina(){
    
    }
    public static ArrayList<Piscina> getInstance(){
        if(lista==null){
		lista=new ArrayList<Piscina>();   
            }
	return lista;
    }
    private ArrayList<Piscina> CrearPiscinas(){
        lista= new ArrayList<Piscina>();
        lista.add(new Piscina(1000));
        lista.add(new Piscina(1100));
        lista.add(new Piscina(1200));
        lista.add(new Piscina(1300));
        lista.add(new Piscina(1400));
        lista.add(new Piscina(1500));
        lista.add(new Piscina(1600));
        lista.add(new Piscina(1700));
        lista.add(new Piscina(1800));
        lista.add(new Piscina(1900));
        lista.add(new Piscina(2000));

        return lista;
    }
}
