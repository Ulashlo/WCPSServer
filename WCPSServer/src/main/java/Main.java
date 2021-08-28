import server.NettyServer;

public class Main {

    public static void main(String[] args) throws Exception {

        int port = 2345;

        new NettyServer(port, System.getenv("DataLocation")).run();
    }
}
