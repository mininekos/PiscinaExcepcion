/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;


public class DaoPiscina {
    
    private static ArrayList<Integer> lista;
    private DaoPiscina(){
    
    }
    public static ArrayList<Integer> getInstance(){
        if(lista==null){
		lista=new ArrayList<Integer>();   
            }
	return lista;
    }
    private ArrayList<Integer> CrearPiscinas(){
        lista= new ArrayList<Integer>();
        lista.add(1000);
        lista.add(1100);
        lista.add(1200);
        lista.add(1300);
        lista.add(1400);
        lista.add(1500);
        lista.add(1600);
        lista.add(1700);
        lista.add(1800);
        lista.add(1900);
        lista.add(2000);
        
        return lista;
    }
}
