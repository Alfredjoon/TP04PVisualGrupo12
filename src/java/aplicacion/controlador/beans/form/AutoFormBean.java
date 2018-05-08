
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Auto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable {
   private List<Auto> listaAutos;
    private Auto auto;

    public AutoFormBean() {
    auto = new Auto();
    listaAutos = new ArrayList();
    listaAutos.add(new Auto(1,"ABC122","FORD", "AZUL", "2017", "NAFTA"));
    listaAutos.add(new Auto(2,"ABC123","CHEVROLET", "NEGRO", "2008", "NAFTA"));
    listaAutos.add(new Auto(3,"ABC124","RENAULT", "VERDE", "1998", "NAFTA"));
    listaAutos.add(new Auto(4,"ABC125","FORD", "AMARILLO", "2000", "NAFTA"));
    listaAutos.add(new Auto(5,"ABC126","FORD", "MARRON", "2010", "NAFTA"));
    listaAutos.add(new Auto(6,"ABC127","RENAULT", "ROJO", "2010", "NAFTA"));
    listaAutos.add(new Auto(7,"ABC128","FIAT", "GRIS", "2010", "NAFTA"));
    }

    public List<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

     
    
    public void asignarAuto(Auto auto){
     this.auto = auto;
     
    }
    
    public void actualizar(Auto auto){
     for(int i =0; i < listaAutos.size();i++){
       if(listaAutos.get(i).getId()== auto.getId()){
         listaAutos.set(i,auto);
       }
    }
    }
}
