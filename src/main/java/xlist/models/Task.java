package xlist.models;

public class Task {
    //private long_id;
    private String listName;
    private Boolean check;


    public Task() {
    }


    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }


    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Task{" +
                "listName='" + listName + '\'' +
                '}';
    }
}
