package customer;
public class Student {
    private String id;
    private String name;
    private int prf;
    private int dbms;

    public Student() {
        
    }

    public Student(String id, String name, int prf, int dbms) {
        this.id = id;
        this.name = name;
        this.prf = prf;
        this.dbms = dbms;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrf() {
        return prf;
    }
    public void setPrf(int prf) {
        this.prf = prf;
    }

    public int getDbms() {
        return dbms;
    }

    public void setDbms(int dbms) {
        this.dbms = dbms;
    }
    
    
}
