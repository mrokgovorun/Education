package megafon;


/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 30.10.13
 * Time: 0:23
 * To change this template use File | Settings | File Templates.
 */
public class Abonent {
    private String fio;
    private String city;
    private String date;

    public String getFio(){
      return this.fio;
    }
    public String getCity(){
        return this.city;
    }
    public String getDate(){
        return this.date;
    }
    public void setFio(String fio){
        this.fio = fio;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setDate(String date) {
        this.date = date;

    }

    public Abonent(String fio, String city, String date){
        this.fio = fio;
        this.city = city;
        this.date = date;

    }
    public Abonent(){

    }


}



