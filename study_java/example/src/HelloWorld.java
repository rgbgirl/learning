package example;
import javax.jws.WebService;
/**
 * created by ywb @intellij on 2018-8-4
 *
 */
public class HelloWorld {
    public String sayTitle(String from) {
        String result = "this is " + from;
        System.out.println(result);
        return result;
    }

    public String sayBody(String Other) {
        String result = "------------body is---------------" + Other;
        System.out.println(result);
        return result;
    }

    public String sayAll(String title, String body) {
        String result = "-----title: "+title+"----------/r/nbody:------------"+body;
        System.out.println(result);
        return result;
    }
}
