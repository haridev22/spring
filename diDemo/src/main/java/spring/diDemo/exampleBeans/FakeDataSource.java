package spring.diDemo.exampleBeans;

public class FakeDataSource {
    private String uName;
    private String pass;
    private String url;

    public FakeDataSource() {
    }

    public FakeDataSource(String uName, String pass, String url) {
        this.uName = uName;
        this.pass = pass;
        this.url = url;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "uName='" + uName + '\'' +
                ", pass='" + pass + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
