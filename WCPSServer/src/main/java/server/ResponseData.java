package server;

import java.util.LinkedList;

public class ResponseData {
    private LinkedList<ResponseItem> response;

    public ResponseData() {
        this.response = new LinkedList<>();
    }

    public void addItem(ResponseItem item){
        response.add(item);
    }

    public ResponseItem getItem(int i){
        return response.get(i);
    }

    public int getSize(){
        return response.size();
    }
}
