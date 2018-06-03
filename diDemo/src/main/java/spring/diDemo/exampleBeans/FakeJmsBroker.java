package spring.diDemo.exampleBeans;

public class FakeJmsBroker {

    private String uname;
    private String pass;
    private String url;

    public FakeJmsBroker() {
    }

    public FakeJmsBroker(String uname, String pass, String url) {
        this.uname = uname;
        this.pass = pass;
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeJmsBroker{" +
                "uname='" + uname + '\'' +
                ", pass='" + pass + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
