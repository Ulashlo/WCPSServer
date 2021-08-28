package gui;

import java.util.LinkedList;

public class Response {
    private LinkedList<String> answers;
    private LinkedList<LinkedList<String>> coverages;
    private LinkedList<Boolean> isImage;
    private boolean isGot;

    public Response() {
        answers = new LinkedList<>();
        coverages = new LinkedList<>();
        isImage = new LinkedList<>();
        isGot = false;
    }

    public boolean isGot() {
        return isGot;
    }

    public void setGot(boolean got) {
        isGot = got;
    }

    public void addAnswer(String answer){
        answers.add(answer);
    }

    public void addCoverages(LinkedList<String> coverage){
        coverages.add(coverage);
    }

    public void addIsImage(boolean b){
        isImage.add(b);
    }

    public LinkedList<String> getAnswers() {
        return answers;
    }

    public LinkedList<LinkedList<String>> getCoverages() {
        return coverages;
    }

    public LinkedList<Boolean> getIsImage() {
        return isImage;
    }
}
