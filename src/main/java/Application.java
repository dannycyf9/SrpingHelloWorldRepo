import com.leapcode.service.SpeakerService;
import com.leapcode.service.SpeakerServiceImpl;

//This is test comments - Yifan
//This is test comments02 - Yifan
public class Application {
    public static void main(String[] args){
        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getLastName());
    }
}
