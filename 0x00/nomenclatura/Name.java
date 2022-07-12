import java.net.URL;
import java.util.Date;

public class Name {
    //variáveis que falam por si só
    //A
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(User user){};
    //B
    public Date getModifiedDate; // modified date
    public List<Testcase> find(User user){}; //find all Testcases by User

    //Declarações corretas
    //A
    public List<Account> AccountList;
    //B
    public Account[] AccountList;

    // Sem Prefixos
    //A
    public void deleteUser(Name.User ProgramUser){};
    //B
    public void deleteUser(Name.User user){};

    // Evite mapa mental
    //A
    public URL getUrl;
    //B
    public URL url;

    // Classe possui nomes próprios, funções devem ter verbos
    //A
    public class TableRepresentar {};
    public void saveCar(){};
    //B
    public class TableRepresenta {};
    public void car(){};

    // Uma palavra por conceito
    //A
    public aveUser(){}; Account(){}; Contract(){};
    //B
    public User(){}; Account(){}; Contract(){};


    //Use constants, enums instead of magic numbers, abbreviations
    //A
    public int daysInYear = Days.DAYS_IN_YEARS;
    public int hoursInWeek =  Days.DAYS_IN_YEARS.hashCode();
    //B
    public final int DAYS_IN_YEAR =  Days.DAYS_IN_YEARS.hashCode();
    public final int HOURS_IN_WEEK =  Days.DAYS_IN_YEARS.hashCode();
}
