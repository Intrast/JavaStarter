package xlist.models;

public class List {

    private long id;
    private String nameList;
    private String comments;
    private String dataCreated;

    public List() {
    }

    public List(long id, String nameList, String comments, String dataCreated) {
        this.id = id;
        this.nameList = nameList;
        this.comments = comments;
        this.dataCreated = dataCreated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(String dataCreated) {
        this.dataCreated = dataCreated;
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", nameList='" + nameList + '\'' +
                ", comments='" + comments + '\'' +
                ", dataCreated='" + dataCreated + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        List list = (List) o;

        if (id != list.id) return false;
        if (nameList != null ? !nameList.equals(list.nameList) : list.nameList != null) return false;
        if (comments != null ? !comments.equals(list.comments) : list.comments != null) return false;
        return dataCreated != null ? dataCreated.equals(list.dataCreated) : list.dataCreated == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (nameList != null ? nameList.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (dataCreated != null ? dataCreated.hashCode() : 0);
        return result;
    }
}
